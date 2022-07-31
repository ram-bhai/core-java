//How to divide an integer number by 2 and multiply by 2 without using arithmetic operator.

import java.util.Scanner;
class Multidiv
  {
    public static void main(String args[])
     {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = scan.nextInt();
    
       System.out.println("Multiplication : " + (a<<1));
       System.out.println("Dividation : " + (a>>1));    
    }
 }
