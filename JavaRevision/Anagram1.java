import java.util.Scanner;
import java.util.Arrays;
public class Anagram1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter first string :- ");
        java.lang.String str1 = sc.nextLine();
        System.out.println("Please Enter second string :- ");
        java.lang.String str2 = sc.nextLine();

        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        if(str1.length()== str2.length()){

            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            boolean result = Arrays.equals(charArray1,charArray2);

            if(result){
                System.out.println(str1 +" and "+ str2 +" are anagram");
            }
            else{
                System.out.println(str1 +" and "+ str2 +" are not anagram");
            }
        }
        else{
            System.out.println(str1 +" and "+ str2 +" are not anagram");
        }

    }
    
}
