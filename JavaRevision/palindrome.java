import java.util.Scanner;

public class palindrome {
    public static void main(String args[]){
        int num;
        int temp=0;
        int rev=0; 
        int sum=0;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number");
            num =  sc.nextInt();
        }
        temp = num;

        while(num!=0){
            rev = num%10;
            sum = (sum*10)+rev;
            num = num/10;
        }

        if(temp == sum){
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Number is not Palindrome");
        }

    }
    
}
