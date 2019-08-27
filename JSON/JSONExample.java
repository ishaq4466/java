// Java program for write JSON to a file 
  
import java.io.FileNotFoundException; 
import java.io.PrintWriter; 
import java.util.HashMap;
import java.util.*; 
import java.util.Map; 
import java.io.FileNotFoundException; 
import java.io.PrintWriter; 
import java.util.LinkedHashMap; 
import java.util.Map; 


import org.json.simple.JSONArray; 
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject;
import org.json.simple.JSONObject;// Java program for write JSON to a file 




// @SuppressWarnings("unchecked")
class JSONExample
{
public static void main(String[] args){

try{
JSONObject jo=new JSONObject();
jo.put("firstName","Louis");
jo.put("LastName","Phillipes");
jo.put("Age","75");

Map m=new LinkedHashMap(3);
m.put("StreetAddress","21nd Street");
m.put("city","New York");
m.put("state","NY");
JSONArray ja=new JSONArray();
ja.add(m);
jo.put("PhoneNumber",m);



PrintWriter pw=new PrintWriter("JSONExample.json");


pw.write(jo.toJSONString());
pw.flush();
pw.close();
}
catch(Exception err){
	err.printStackTrace();
}
}
}

// $ javac -cp ".;./jars/json-simple-1.1.1.jar" -Xlint:unchecked JSONExample.java
// $ java -cp ".;./jars/json-simple-1.1.1.jar" JSONExample
