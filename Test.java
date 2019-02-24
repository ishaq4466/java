/*FROM node:6.9.2
COPY server.js .
EXPOSE 8080
CMD node server.js

>gcloud container clusers create hello=world\
--num-nodes 

>gcloud config configurations list

FROM node:6.9.2
WORKDIR /app
ADD . /app
EXPOSE 8080
CMD ["node", "server.js"]


gcloud config set project PROJECT_ID

gcloud container clusters create hello-world \
                --num-nodes 2 \
                --machine-type n1-standard-1 \
                --zone us-central1-a
*/




/*
Step1. Get the current path

Step2. Get the file names in the current path, excluding the .class file

Step3. Compare the two files 
    3.1 If both the files are identical then return "Same"
    3.2 Else return the line number 

import java.io.BufferedReader;
import java.io.FileReader;*/
import java.io.*;
import java.util.*;

class Test
{

	public static void main(String[] args) {
		
		try{
			String s1="Hello.txt";
			//System.out.println(s1+" "+s1.substring(0,s1.indexOf('.'))+".java");
			System.out.println(s1.substring(s1.indexOf('.'),s1.length(l̥)));
		}
		catch(Exception err)
		{

		err.printStackTrace();
		}
	}


	}






/*
All string class Function
		
		String s1="HelloWorld.txt";
			System.out.println("equals: "+s1.equals("helloWorld"));
			System.out.println("indexOf: "+s1.indexOf('.'));
			System.out.println("toUpperCase: "+s1.toUpperCase());
			System.out.println("toLowerCase(): "+s1.toLowerCase());
			System.out.println("toString(): "+s1.toString());
			System.out.println("length(): "+s1.length());
			System.out.println("substring: "+s1.substring(0,8));
			System.out.println("substring: "+s1.substring(8));
			System.out.println("charAt(1): "+s1.charAt(1));

*/


/*
**StringBuffer class-->peer class of String class
**The string can be modified as well as length can be changed 
 dyamamically
**StringBuffer sb1=new StringBuffer();
**Can use all String class function by using the .toString() function
StringBuffer sb1=new StringBuffer();
		sb1.append('a');


*/ 


/*
File class containing two subclasses
for handling file reading and writing

File infile=new File("abc.txt")
File outfile=new File("pqr.txt")

FileReader ins=new FileRead(infile);

FileWriter outs=new FileRead(outfile);

int ch=ins.read()!=-1
*/

/*

Regular expression java.lang.String
replaceAll("[^a-zA-Z0-9_-]", "") --> which will replace anything with 
empty String except a to z, A to Z, 0 to 9,_ and dash
replaceAll("!", "")


*/








/*


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class CompareTextFiles
{   
    public static void main(String[] args) throws IOException
    {   
        BufferedReader reader1 = new BufferedReader(new FileReader(""));
         
        BufferedReader reader2 = new BufferedReader(new FileReader("C:\\file2.txt"));
         
        String line1 = reader1.readLine();
         
        String line2 = reader2.readLine();
         
        boolean areEqual = true;
         
        int lineNum = 1;
         
        while (line1 != null || line2 != null)
        {
            if(line1 == null || line2 == null)
            {
                areEqual = false;
                 
                break;
            }
            else if(! line1.equalsIgnoreCase(line2))
            {
                areEqual = false;
                 
                break;
            }
             
            line1 = reader1.readLine();
             
            line2 = reader2.readLine();
             
            lineNum++;
        }
         
        if(areEqual)
        {
            System.out.println("Two files have same content.");
        }
        else
        {
            System.out.println("Two files have different content. They differ at line "+lineNum);
             
            System.out.println("File1 has "+line1+" and File2 has "+line2+" at line "+lineNum);
        }
         
        reader1.close();
         
        reader2.close();
    }
}

*/


/*
import java.util.*;
import java.io.*;	
class Test
{

public static void main(String[] args) {
//String s1="Hello.txt";
//int p=a.indexOf('.');
//System.out.println("sad"+s1.indexOf('.'));
//System.out.println(s1.equals("Hello.txt"));
//System.out.println(s1.toLowerCase());
//System.out.println(s1.substring(0,5));
//System.out.println(s1.substring(5));
//System.out.println(s1.charAt(5));
//StringBuffer str1=new StringBuffer();
//str1.append("HEllo.txt");
//.toString();
//s1.compareTo(s2)<0 if s1>s2
	
//StrinfBuffer b1=new StringBuffer();
//b1.append("as");
//System.out.println(b1.toString().equals());



}



}


*/



