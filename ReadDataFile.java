import java.io.File;
import java.util.Scanner;
class ReadDataFile {
    public static void main(java.lang.String[] args)throws java.io.FileNotFoundException{
        File f = new File("Ram.txt");
        Scanner sc = new Scanner(f);
        try{
            while(true){
                java.lang.String line = sc.nextLine();
                System.out.println(line);
            }
            
        }
        catch(java.util.NoSuchElementException e){
            System.out.println("No  more data availabl there.... ");
        } 
         sc.close();
    }
}
