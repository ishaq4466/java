/*
StringBuffer class-->"peer" class of String class(java.lang package)

**Exploring the Peer Classes of Java String: Java StringBuilder and Java StringBuffer
developer.com

**Since String class objects cannot be resized 
aur maniputalated 

**We can achieve that with StringBuffer class
which create dynamic strings i.e flexible in both lenght and contents

**Some String class methods cannot  be used by first converting StringBuffer object to String by using sb.toString() 

**Methods for StringBuffer class
sb.append(s1)-->appends a string s1 to sb
sb.setCharAt(6,'-')--> modifies  char at 6th position to '-'


**Important lines

sb1=sb1.toString().toLowerCase()-->Result an error

StringBufferClass.java:34: error: 
incompatible types: 
String cannot be converted to StringBuffer

*/

import java.lang.*;

class StringBufferClass
{
	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer("asdasdJJSDJ;KSJD");
		StringBuffer sb2=new StringBuffer("asdasdJJSDJKSJD");
		
		System.out.println(sb1);
		System.out.println(sb2);

		//sb1=sb1.toString().toLowerCase();-->ERRRROORRRFULL line
		
		sb1=new StringBuffer(sb1.toString().toLowerCase());
		sb2=new StringBuffer(sb2.toString().toLowerCase());
		
		System.out.println("sb1:"+sb1);
		System.out.println("sb2:"+sb2);
		sb1.equals(sb2);
	}
}
