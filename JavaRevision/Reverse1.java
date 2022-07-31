import java.util.Scanner;
public class Reverse1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int remainder = 0;
        int sum = 0;

        System.out.println("Please enter a number :");
        int num = input.nextInt();
        input.close();
        int temp = num;

        while(num != 0){
            remainder = num%10;
            sum = (sum*10)+remainder;
            num = num/10;
        }
        System.out.println("Reverse is : "+sum);

    }
    
    
}
