/*
**Unziping a .zip folder from source to destination 
folder
**It uses java.util.zip.ZipEntry java.util.zip.ZipInputStream  

*/

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
public class UnzipFiles {
 private static final int BUFFER_SIZE = 4096;
    /*
     * Extracts a zip file specified by the zipFilePath to a directory specified by
     * destDirectory (will be created if does not exists)
     * @param zipFilePath
     * @param destDirectory
     * @throws IOException
     */
    public static void unzip(String zipFilePath, String destDirectory) throws IOException {
        
        File destDir = new File(destDirectory);
        if (!destDir.exists()) {
            destDir.mkdir();
            System.out.println("directory made");
        }

     //   System.out.println(zipFilePath);
      
        ZipInputStream zipIn = new ZipInputStream(new FileInputStream(zipFilePath));
        System.out.println(zipFilePath);     
        ZipEntry entry = zipIn.getNextEntry();
        
        // iterates over entries in the zip file
      
        while (entry != null) {
            String filePath = "."+ File.separator + entry.getName();
            System.out.println("Filepath:"+entry.getName());     
                    
            if (!entry.isDirectory()) {
                // if the entry is a file, extracts it
                extractFile(zipIn, filePath);
            } else {
                // if the entry is a directory, make the directory
                File dir = new File(filePath);
                dir.mkdir();
            }
            zipIn.closeEntry();
            entry = zipIn.getNextEntry();
        }
        zipIn.close();
    }
    /**
     * Extracts a zip entry (file entry)
     * @param zipIn
     * @param filePath
     * @throws IOException
     */
    private static void extractFile(ZipInputStream zipIn, String filePath) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath));
        byte[] bytesIn = new byte[BUFFER_SIZE];
        int read = 0;
        while ((read = zipIn.read(bytesIn)) != -1) {
            bos.write(bytesIn, 0, read);
        }
        bos.close();
    }

    public static void main(String[] args) {
        File zipFileName=new File("pathes.zip");

        //String zipFilePath = "/c/Users/ishaq/Desktop/wallpaper/java/pathes.zip";
        //String destDirectory = "C:\\User\\ishaq\\Desktop\\wallpaper\\java\\";
        
        try {
            System.out.println("source:"+zipFileName.getCanonicalPath());
            System.out.println("destinition:"+System.getProperty("user.dir")+"\\output");
            
            unzip(zipFileName.getCanonicalPath(),System.getProperty("user.dir")+"\\output");
        } catch (Exception ex) {
            // some errors occurred
            ex.printStackTrace();
        }
    }


}

