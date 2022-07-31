// Write a java program to multiply a number with 2 without using arithmatic operator.

import java.util.Scanner;  
 class Multiplication  
   {  
       public static void main(String args[])  
          {  
               int result=0;      
               Scanner scan = new Scanner(System.in);   
               System.out.println("Enter first number : ");  
               int  a = scan.nextInt();  
               System.out.print("Enter second number : ");  
               int  b=scan.nextInt();  
                
           
                   while(b != 0)  
                    {  
                          int x = (a & b);    
                          a = a ^ b;  
                          b = x<<1;
                   }
                System.out.println("Result is : "+a);
          }
  }
