
import java.util.Scanner;
public class Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Please enter a number :");
        int num = sc.nextInt();
        System.out.println("Please enter the limit :");
        int limit = sc.nextInt();
        sc.close();

        for(int i = 1; i<=limit; i++){
             sum = sum + num;
        }
        System.out.println(sum);
    }
} 
    
