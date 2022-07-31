//Write a java program to reverse a string with using string inbuilt function reverse().
import java.util.Scanner;

public class reverstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        java.lang.String str = sc.nextLine();
        sc.close();
        StringBuilder str2 = new StringBuilder();
        str2.append(str);
        System.out.println(str2.reverse());  
    }
    
}
