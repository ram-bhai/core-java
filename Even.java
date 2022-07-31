//To print all even numbers.

import java.util.Scanner;

class CheckEven
    {
      public static void main(java.lang.String args[])
         {
             Scanner sc =new Scanner (System.in);
             int n;
             System.out.println("Enter a number :-\t");
             n= sc.nextInt();
             sc.close();
         
             if(n%2==0)
             System.out.println("This is an even number");
             else
             System.out.println("This is an odd number.");
             
          }   
      }
