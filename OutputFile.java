import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
class OutputFile {
    public static void main(java.lang.String[] args){
   
    try{
        File f = new File("Ram.txt");
        FileInputStream fin = new FileInputStream(f);
        java.lang.String s = "  ";
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
