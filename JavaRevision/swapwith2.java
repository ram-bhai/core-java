// Write a java program to swap two numbers without using third variable.
import java.util.Scanner;
public class swapwith2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number :\t");
        int num1 = sc.nextInt();
        System.out.print("\nEnter second number :\t");
        int num2 = sc.nextInt();
        sc.close();
        System.out.printf("Before swapping numbers are :\t num1:%d\t num2:%d",num1,num2);
        // num1 = num1 + num2;
        // num2 = num1 - num2;
        // num1 = num1 - num2;

        num1 = num1 * num2;
        num2 = num1/ num2;
        num1 = num1/num2;

        System.out.printf("\nAfter swapping numbers are:\t num1:%d\t num2:%d",num1,num2);

    }
    
}
