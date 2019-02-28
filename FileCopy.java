import java.io.*;

class FileCopy
{

	public static void main(String[] args) {
		

		File file = new File("abc.txt");
		File[] 
		try{
		String sourcePath=file.getCanonicalPath();
		String destiPath=new File("output").getCanonicalPath(); 
         System.out.println(sourcePath);
         System.out.println(destiPath);
        // renaming the file and moving it to a new location 
        if(file.renameTo(new File(destiPath+"\\"+"sd.txt"))) 
        { 
            // if file copied successfully then delete the original file 
            file.delete(); 
            System.out.println("File moved successfully"); 
        } 
        else
        { 
            System.out.println("Failed to move the file"); 
        } 
    }
    catch(IOException err)
    {
    	err.printStackTrace();
    }
	}

}
