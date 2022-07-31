import java.io.FileWriter;
class TrywithResource{
    public static void main(String[] args){
        try(FileWriter fw = new FileWriter("new.txt")){
            fw.write("New is a recently created file....");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    
}
