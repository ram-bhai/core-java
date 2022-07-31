//Program to reverse a given number.
import java.util.Scanner;
class Reverse
  {
     public static void main(String args[])
      {
         int num, r, s=0;
         Scanner sc = new Scanner(System.in);
         System.out.printf("Enter a number : \t");
         num= sc.nextInt();
         
         while(num!=0)
         {
             r =num%10;
             s= s*10+r;
             num= num/10;
        }
        
        System.out.printf("Reverse of the number is : \t" +s);
     }
   
 }       
             
