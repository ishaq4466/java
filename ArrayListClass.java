	/*
	ArrayListClass-->resizeable array

	Important ArrayList fuctions:
	.add("sasd")
	.size()
	.get(0)
	.set(0,"abc.txt")-->modifying the 0th elements
	.remove(0)
	.clear()-->clearing all the elements from the list

	For Sorting the array list we can use the Collections class 
	sort function Collections.sort()
	*/
	import java.util.*;
	class ArrayListClass
	{
	public static void main(String[] args) 
	{

		try{


		ArrayList<String> lista=new ArrayList<String>();
		lista.add("Hello World");
		lista.add("World is full of");
		lista.add("shitttzzz");
		for(String str:lista)
		{
			System.out.println(str);
		}
		System.out.println("=========================");
		for(int i=0;i<lista.size();i++)
		{
			System.out.println(lista.get(i));
		}



		/*ArrayList<String> filenames=new ArrayList<String>();
		filenames.add("Hello.java");
		filenames.add("Hello.class");
		filenames.add("Zamd.txt");
		filenames.add("Zamdkd.txt");


		// for(int i=0;i<filenames.size();i++)
		// System.out.println(filenames.get(i));

//		Collections.sort(filenames);
		ArrayList<Integer> index=new ArrayList<Integer>();


		for(String str : filenames)
		{
			if(str.substring(str.indexOf('.'),str.length()).equals(".class")||str.substring(str.indexOf('.'),str.length()).equals(".java"))
				{
					System.out.println(filenames.indexOf(str)+":"+str);
					System.out.println("True");
					index.add(filenames.indexOf(str));
				}

		}
		for(Integer i : index)
		{
			System.out.println(i+" "+filenames.get(i)+"-->Removed");
			filenames.set(i.intValue(),null);
			}

		//filenames.remove(1);
	for(String str : filenames)
		{
			System.out.println("\n==============\n"+filenames.indexOf(str)+":"+str);
		}*/
		}
		catch(Exception err)
		{
			err.printStackTrace();
		}
	}
	}