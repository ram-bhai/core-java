import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
class CreateFile {
    public static void main(java.lang.String[] args){
   
    try{
        File f = new File("Ram.txt");
        FileOutputStream fout = new FileOutputStream(f,true);
        java.lang.String s = "My first file generation program";
        byte data[]=s.getBytes();
        fout.write(data);
    }
    catch(IOException e)
    {
        System.out.println("Something went wrong");
    }
    }
    
}

