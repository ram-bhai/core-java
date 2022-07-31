// package JavaRevision;

import java.util.Scanner;

public class armstrong {
    public static void main(String args[]){
        int num;
        int temp = 0;
        int sum = 0;
        int rev = 0;

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();
        sc.close();
        temp = num;

        while(num!=0){
            rev = num%10;
            sum = sum+(rev*rev*rev);
            num = num/10;
        }
        if(sum == temp){
            System.out.println("Number is armstrong");
        }
        else{
            System.out.println("Number is not armstrong");
        }
        System.err.println("This is an error message");

    }

}
