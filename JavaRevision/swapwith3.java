//Write a java program to swap two numbers using third variable.
import java.util.Scanner;
public class swapwith3 {
    public static void main(String[] String) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int x = sc.nextInt();
        System.out.println("Enter second number");
        int y = sc.nextInt();
        sc.close();
        System.out.printf("Before swapping :\t X:%d\t Y:%d",x,y);
       int z =x;
        x = y;
        y = z;
        System.out.printf("\nAfter swapping :\t X:%d\t Y:%d",x,y);

    }
    
}
