import java.util.Scanner;
import java.util.Scanner;
class DataValidation{
    public static boolean isValidName(String name){
        name = name.trim();
        for(int i=0; i<name.length(); i++){
          char ch = name.charAt(i);
          if(!(Character.isAlphabetic(ch) || Character.isSpace(ch)))
           return false;  
        }
        return true;
     }
    }
    class TestMain{
        public static void main(String args[]){
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter name");
           java.lang.String name = sc.nextLine();
      
           if(DataValidation.isValidName(name))
           {
             System.out.println("Valid name");
           }
           else{
             System.out.println("Invalid name"); 
           }   
        }
    }    