// Write a Java Program to print odd number from 1 to n using continue statement and do-while loop.

import java.util.Scanner;
class Odd{
  private int n;
  public Odd(int n){
    this.n = n; 
  }
  
  public void displayOddNumbers(){
    int i=0;
    do{
       i++;
       if(i%2==0)
         continue;
       System.out.println(i+" ");
    }
    while(i<=n);
  }
}

class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the limit : ");
    int n = scan.nextInt();
    
    Odd o = new Odd(n);
    o.displayOddNumbers();
  }
}
