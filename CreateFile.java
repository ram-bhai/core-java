import java.io.File;
import java.io.IOException;
class CreateFile {
    public static void main(String[] args){
    File f = new File("Ram.txt"); 
    try{
        if(f.createNewFile())
        {
            System.out.println("File has been successfully created....");
        }
        else{
            System.out.println("File exists....");
        }
    }
    catch(IOException e)
    {
        System.out.println("Exception has successfully handeled....");
    }
    }
    
}
