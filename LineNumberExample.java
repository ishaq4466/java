import java.io.*;
import java.io.File;

import java.util.*;
/*import java.io.IOException;
import java.io.LineNumberReader;
*/



class LineNumberExample
{
	public static void main(String[] args) throws IOException{
		FileReader fr=null;
		BufferedReader br=null;
		LineNumberReader lnr=null;
		String line="";
		int i;
		// String sep=File.separator;
        // System.out.println("File.separator/ = "+File.separatorChar);
		try{
		// br=new FileReader(""/"c"/"Users/ishaq/Desktop/javaNotebook/pqr.txt");

		fr=new FileReader("pqr.txt");
		lnr=new LineNumberReader(fr);
		int c;

		if(lnr.markSupported())
		{
			System.out.println("Is supported");
			lnr.mark(72);
		}

		System.out.println(lnr.readLine());
		System.out.println(lnr.readLine());
		System.out.println(lnr.readLine());
		// lnr.reset();
	

		if(lnr.markSupported())
		{
			// System.out.println("Is supported");
			lnr.mark(97);
		}
		lnr.reset();
		System.out.println(lnr.readLine());
		lnr.reset();
		System.out.println(lnr.readLine());
		
		// char a='a';
		// System.out.println((int)'a');


		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}

	}
}