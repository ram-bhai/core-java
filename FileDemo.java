import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Scanner;


public class FileDemo    
 {
     public static void main(java.lang.String args[])
     {   
        File myFile = new File("myFile1.txt");
         try
         {
           myFile.createNewFile();
         } 
         catch(IOException e)
         {
           System.out.println("Unable to create this file");
           e.printStackTrace();
         }
// Code to write in a file.
  try
  {
    FileWriter sc = new FileWriter ("myFile1.txt");
  }
  catch(IOException e)
  {
    e.printStackTrace();
   }
   try
    {
      Scanner sc = new Scanner(System.in);
      sc.write("This is first file of java");
      sc.close();
     }
       catch (IOException e){
       e.printStackTrace();
      }
    
  }
 }
