/*

String class methods
	equals	 	:s1.equals("helloWorld")--> return true if s1 equals s2
	eualsIgnoreCase: s1.equalsIgnoreCase("asdas")
	indexOf 	:s1.indexOf('.')
	toUpperCase :s1.toUpperCase
	toLowerCase :s1.toLowerCase
	toString 	:s1.toString
	length 		:s1.length
	substring	:s1.substring(0,8)
			   	 s1.substring(5)-->return substring from 5th to end
	concat 		:s1.concat("Im concating with s1")
	charAt(1) 	:s1.charAt(1)
	compareTo	:s1.compareTo(s2)--> retrun -1 if s1<s2 else 0 in s1=s2
	toString	:s1=p.toString();--> convert a non-string object to string object

**Strings objects are non-immutable: They cannot be resize or the contents can be 
									changed

For example s1="Hello World"
			s1[12]="a";--> it will raise an error

***However the string cannot be changed but there reference
[String is immutable(Stackoverflow)]


*/




class StringFunc
{

	public static void main(String[] args) {
		try
		{
			String s1="HelloWorld.txt";
			System.out.println("::All String class functions::");
			System.out.println("equals		:"+s1.equals("helloWorld"));
			System.out.println("indexOf		:"+s1.indexOf('.'));
			System.out.println("toUpper 	:"+s1.toUpperCase());
			System.out.println("toLowerC 	:"+s1.toLowerCase());
			System.out.println("toString()	:"+s1.toString());
			System.out.println("length()	:"+s1.length());
			System.out.println("substring	:"+s1.substring(0,8));
			System.out.println("substring	:"+s1.substring(8));
			System.out.println("charAt(1)	:"+s1.charAt(1));
			System.out.println("conacat		:"+s1.concat(" Im concating"));
			}
		catch(Exception err)
		{
			err.printStackTrace();
		}


	}
}
