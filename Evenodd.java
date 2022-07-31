//Write a Java program to check whether a Integer number is even or odd without using arithmetic operator.

import java.util.Scanner;
class Evenodd
  {
   private int n;
   public Evenodd(int n)
   {
     this.n = n;
   }
   
   public void evenOdd()
   {
     if((n&1)==(0))
       System.out.println("Even");
    else
       System.out.println("Odd");
    }
 }

class Main
   {
	     public static void main(String args[]){
	     Scanner scan = new Scanner(System.in);
	     System.out.print("Enter a number : ");
	     int n = scan.nextInt();
       scan.close();
	     Evenodd f = new Evenodd(n);
	     f.evenOdd();
    }
}
