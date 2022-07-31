import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
 class FileCount
{
        public static void main(java.lang.String[] args)
    {
        try{
            File f = new File("Ibf.txt");
            FileOutputStream fout = new FileOutputStream(f,true);
            java.lang.String s = "\nThis is a new file created by me and i am a student of an most Popular IT company which name is Infobeans...";
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