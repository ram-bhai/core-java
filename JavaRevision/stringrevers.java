//Write a java program to reverse a string without using string inbuilt function reverse().

import java.util.Scanner;
public class stringrevers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string");
        java.lang.String str = sc.nextLine();
        sc.close();

        char chars[] = str.toCharArray();
        for(int i = chars.length-1; i>=0;i--){
            System.out.print(chars[i]);
        }


    }
    
}
