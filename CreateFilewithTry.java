import java.io.*;
class CreateFilewithTry {
    public static void main(String[] args)throws IOException{
        File f = new File("Ram.txt");
        try{
            if(f.createNewFile()){
                System.out.println("File has been created successfully....");
            }
            else{
                System.out.println("File already exist in current directory....");
            }
        }
        catch(IOException e){
            System.out.println("Exception has been handeled....");
        }
    }
}
