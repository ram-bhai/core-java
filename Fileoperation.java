/*Write a java program to read/write data into the file.(Use FileOutputStream,FileInputStream).*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Fileoperation
{
        public static void main(java.lang.String[] args)
    {
        try{
            File f = new File("Ram.txt");
            FileOutputStream fout = new FileOutputStream(f,true);
            java.lang.String s = "\nThis is the updated version of File...";
            byte data[]=s.getBytes();
            fout.write(data);
            FileInputStream fin = new FileInputStream(f);
             s = "  ";
            while(true)
            {
                int x = fin.read();
                if(x==-1)
                break;
                s = s+(char)x;
            }
            System.out.println(s);
        }
        catch(IOException e)
         {
           e.printStackTrace();
         }
    }
    
}
