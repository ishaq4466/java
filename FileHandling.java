/* File Handling and regular expression in Java

**File class(java.io.*) containing two subclasses
for handling file reading and writing
1.FileReader 
2.FileWriter
*/


/* 
Writing a java program to read from one file and write into 
another using FileReader and FileWriter class object
*/

import java.io.*;
import java.lang.*;

class FileHandling{
	public static void main(String[] args) {
		try{
		StringBuffer sb1=new StringBuffer();
		String fileName="abc.txt";
		File f1=new File(fileName);
		FileReader ins=new FileReader(f1);
		File f2=new File("pqr.txt");
		FileWriter outs=new FileWriter(f2);

		int ch;
		while((ch=ins.read())!=-1)
		{
			sb1.append((char)ch);
			outs.write(ch);
		}	
		System.out.println(sb1);
		ins.close();
		outs.close();
		}
		catch(Exception err)
		{
			err.printStackTrace();
		}
	}
}