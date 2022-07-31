import java.util.Scanner;
public class ArmStrong1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int num=0;
        // int temp = 0;
         int remainder =0;
         int sum = 0;

        System.out.println("Please enter a number :");
        int num = sc.nextInt();
        sc.close();
        int temp = num;

        while(num!=0){
            remainder = num%10;
            sum = sum+(remainder*remainder*remainder);
            num = num/10;
        }
        if(sum==temp){
            System.out.println("Number is armstrong. ");
        }
        else{
            System.out.println("Number is not armstrong.");
        }

    }
    
}
