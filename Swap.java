//Write a Java program to swap the value of two integer variable without using aritmetic operator and without using third variableimport java.*; 
  
  
  import java.util.Scanner;
class Swap 
   { 
      public static void main(String a[]) 
        { 
		 Scanner sc =new Scanner(System.in);
		 System.out.println("Enter first number ");
		 int x=sc.nextInt();
		 System.out.println("Enter second number ");
		 int y=sc.nextInt();
		 sc.close();
		 System.out.println("Before swapping: "+ " x = " + x + ", y = " + y);
		 
		     x = x ^ y;  
		     y = x ^ y;  
		     x = x ^ y;  
		System.out.println("After swaping:"+ " x = " + x + ", y = " + y); 
        } 
} 



