//Write a Java program to swap the value of two integer variable without using aritmetic operator and without using third variable.

import java.util.Scanner;
class Swap
   {
     private int a,b;
     public Swap(int a,int b){
    this.a = a;
    this.b = b;
  }
  public void swap(){
    a = a^b;
    b = a^b;
    a = a^b;
    
    System.out.println("A : " + a);
    System.out.println("B : " + b);
  }
}
class Main{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter two numbers : ");
    int a = scan.nextInt();
    int b = scan.nextInt();
    scan.close();
    
    Swap s = new Swap(a,b);
    s.swap();
  }
}
