//Write a java program to check, whether a Integer number is even or odd without using if-else statement.

import java.util.Scanner;
class Test
   {
      public static void main(String args[])
        {
          Scanner scan = new Scanner(System.in);
    
          System.out.println("Enter First Number : ");
          int a = scan.nextInt();
    
     switch(a%2)
       {
         case 0 : System.out.println("Even");
                        break;
         case 1 : System.out.println("Odd");
       }
    
    }
 }
