/*
**Unziping a .zip folder from source to destination 
folder
**It uses java.util.zip.ZipEntry java.util.zip.ZipInputStream  

*/
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.*;
import java.io.*;
import java.lang.*;


class Test extends Thread
{
    static int sum=0;
    int status=0;
    int para=10;
    String a;

    public Test(String x)
    {
        this.a=x;
    }

    public void run()
    {
        try{

            System.out.println("Im in thread");
            if(para==1)
                status=0;
            else
                status=-1;

        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    System.out.println("Status: "+status);

    }



}

public class copyUnxip extends Thread{

String filePath="";

ArrayList<String> fileName=new ArrayList<String>();
HashMap<String,Integer> loadingStatus =new HashMap<String,Integer>();




    public void callThreadMethod()
    {
        String status="";

        try{

            new Test("v200").start();

        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }

public void fileAdd()
{
    this.filePath="/home/jboss/FILES";
    fileName.add(filePath+"/TC05.txt");
    fileName.add(filePath+"/TC3300.txt");
    for(int i=0;i<fileName.size();i++)
        loadingStatus.put(fileName.get(i),0);
        // System.out.println("File "+i+": "+fileName.get(i));
   System.out.println("Get the size of hashMap: "+loadingStatus.size()); 
    for(int i=0;i<fileName.size();i++)
           System.out.println("Status: "+loadingStatus.get(fileName.get(i)));
  
    for(String str:loadingStatus.keySet())
        System.out.println("fileName: "+str);
}   


public void propExample(String filePath)
{
    Map<String,String> recordMap=new HashMap<String,String>();
    String strQuery="Insert into app_visa_204A(filename";
    String strValues=") values ('"+filePath+"'";
    ArrayList<String> insertList=new ArrayList<String>();

    try
    {
        System.out.println(filePath);
        FileReader fr=new FileReader(filePath);
        Properties pr=new Properties();
        pr.load(fr);
        for(Object k:pr.keySet())
        {
            
            System.out.println("Keys: "+(String)k);
            System.out.println("Value: "+pr.getProperty((String)k));
            recordMap.put((String)k,pr.getProperty((String)k));
        }
        String value="";

        for(Object k:recordMap.keySet())
        {
            System.out.println("kMap: "+(String)k);
            System.out.println("kValue: "+recordMap.get((String)k));
            strQuery+=","+(String)k;
            // if((value=recordMap.get((String)k)).equals(""))
                // value=null;
            strValues+=",'"+value+"'";
        }


        strValues+=")";
        System.out.println("insert qury: "+strQuery+strValues);
        
        /*insertList.add(strQuery+strValues);
        insertList.add(strQuery+strValues);
        insertList.add(strQuery+strValues);
        for(String s:insertList)
        System.out.println(">>>>"+s);//insertList.get(0));*/
        System.out.println("Contains key: "+pr.containsKey("col6"));
        System.out.println("Contains key: "+pr.getProperty("column_5"));


    }
    catch (Exception e) {
        e.printStackTrace();
    }
}

public void readFile(String filePath)
{   String line="";
    int readFlag=0;
    BufferedReader br=null;
    try{

        br=new BufferedReader(new FileReader(filePath));
        System.out.println("filePath: "+filePath);
        while((line=br.readLine())!=null)
        {
            if(line.contains("TRANS.FUNC"))
            {
                System.out.println(""+line);
                line=br.readLine();
                System.out.println(">>"+line);
                line=br.readLine();
                
                while(!line.contains("----------"))      
                {
                    System.out.println(line);
                    line=br.readLine();
                }
                // readFlag=1;
            }
            if(readFlag!=0)
            System.out.println(">>>"+line);
            
            if(line.contains("----------"))
            {
                System.out.println(""+line);
                line=br.readLine();
                System.out.println(line+"\n");
                readFlag=0;

            }

        }
        br.close();
    }
    catch(Exception ex)
    {
        ex.printStackTrace();
    }

}


public void matrixRead(String filePath)
{   String line="";
    int readFlag=0;
    BufferedReader br=null;
    String []row;
    String []rows={"A","B","C","D","E","F","G"};
    Map<String,String> hm=new HashMap<String,String>();
    ArrayList<ArrayList<String> > aList=new ArrayList<ArrayList<String> >();
    try{

        br=new BufferedReader(new FileReader(filePath));
        System.out.println("filePath: "+filePath);
        while((line=br.readLine())!=null)
        {   
            ArrayList<String> a=new ArrayList<String>();
            if(line.contains("col1")|| line.contains("------"))
                continue;
            String row1[]=line.trim().replaceAll("\\s+"," ").split(" ");
            // System.out.println(Arrays.toString(row1));
            for(String x:row1)
                a.add(x);
            aList.add(a);
        // System.out.println("");
        }

        br.close();
        
        System.out.println("size of aList"+aList.size());
        for(int i=0;i<aList.size();i++)
        {
            if(aList.get(i).size()!=4){
                System.out.println("rowNum:"+i);
            for (int j=0;j<aList.get(i).size();j++ ) {
                System.out.print(aList.get(i).get(j)+" ");
                // System.out.println(aList.get(i).get(j).size());
            }
            System.out.println("\n>>Before rowNum:"+(i-1)+" >Length:"+aList.get(i-1).size());
            for(int j=0;j<aList.get(i-1).size();j++)
            {
                System.out.print(aList.get(i-1).get(j)+" ");
            }
            System.out.println("");
             for (int j=0;j<aList.get(i).size();j++ ) {
                System.out.print(aList.get(i).get(j)+" ");}
            if((i+1)!=aList.size()){
            System.out.println("\n>>After rowNum:"+(i+1)+" >Length:"+aList.get(i+1).size());
            for(int j=0;j<aList.get(i+1).size();j++)
            {
                System.out.print(aList.get(i+1).get(j)+" ");
            }
            aList.get(i).add("-");
            System.out.println("\nAfffter>>");
            for (int j=0;j<aList.get(i).size();j++ ) {
                System.out.print(aList.get(i).get(j)+" ");
                // System.out.println(aList.get(i).get(j).size());
            }

            }
        }
                System.out.println();
        }




    }
    catch(Exception ex)
    {
        ex.printStackTrace();
    }

}


public static void main(String[] args) {


    try{
            
        // fileName.add(filePath+"/TC05.txt");
             copyUnxip cu=new copyUnxip();
            // cu.callThreadMethod();
            // cu.fileAdd();
            //cu.propExample("db.properties");
             System.out.println("FilePath: "+args[0]);
             //cu.readFile(args[0]);
             cu.matrixRead(args[0]);

    }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }

        // fr.close();
    }

/*    public static void main(String[] args) {
        String zipFilePath = "C:/Users/ishaq/Desktop/wallpaper/java/";
        String filename="pathes.zip";
        zipFilePath=zipFilePath+filename;
        System.out.println("Filename is "+filename+" "+zipFilePath);

        String destDir = "/Users/pankaj/output";
        //System.out.println(destDir)
        //unzip(zipFilePath, destDir);
    }

    private static void unzip(String zipFilePath, String destDir) {
        File dir = new File(destDir);
        // create output directory if it doesn't exist
        if(!dir.exists()) dir.mkdirs();
        FileInputStream fis;
        //buffer for read and write data to file
        byte[] buffer = new byte[1024];
        try {
            fis = new FileInputStream(zipFilePath);
            ZipInputStream zis = new ZipInputStream(fis);
            ZipEntry ze = zis.getNextEntry();
            while(ze != null){
                String fileName = ze.getName();
                File newFile = new File(destDir + File.separator + fileName);
                System.out.println("Unzipping to "+newFile.getAbsolutePath());
                //create directories for sub directories in zip
                new File(newFile.getParent()).mkdirs();
                FileOutputStream fos = new FileOutputStream(newFile);
                int len;
                while ((len = zis.read(buffer)) > 0) {
                fos.write(buffer, 0, len);
                }
                fos.close();
                //close this ZipEntry
                zis.closeEntry();
                ze = zis.getNextEntry();
            }
            //close last ZipEntry
            zis.closeEntry();
            zis.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
*/

}



