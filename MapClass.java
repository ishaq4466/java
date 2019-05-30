import java.util.*;
import java.io.*;
/*

* Explains the use of Maps in java
* Map is basically a key:Value DS
* Basic method used in Maps: 

-put(key,value):insert entry into a map
-get(key):return specified values for that key
-putall(Map map):insert a specified map into another map
-remove(key): Remove an entry from map
-boolean containsKey(key):search a specified key from the map
- Set keySet():return a Set view containing all the keys()
-Set entrySet(): return all the set containg all keys and values

*/
class MapClass
{
	public static void main(String[] args) {
		Map<Integer,String> student=new HashMap<Integer,String>();
		student.put(1,"me");
		student.put(2,"you");
		student.put(3,"we");
		
		Set<Map.Entry<Integer,String>> st=student.entrySet();
		
		for(Map.Entry<Integer,String> me:st)
		{
			System.out.print(me.getKey()+":");
			System.out.println(me.getValue());

		}
		if(student.containsKey(1))
			{
				System.out.println("True...");
				System.out.println(student.get(1));
			}

		ArrayList<String> employees=new ArrayList<String>(); 
		employees.add("Akshay");
		employees.add("Abhi");
		employees.add("Narendra");

		// for(String str:employees)
			// System.out.println(str);
		Map<Integer,ArrayList<String>> mp=new HashMap<Integer,ArrayList<String>>();
		mp.put(1,employees);
		Iterator itr=mp.get(1).iterator();
		// for(String str:mp.get(1))
		// 	System.out.println(str);
		while(itr.hasNext())
			System.out.println(itr.next());



	}

}


