// to check greater number bertween three numbers.

import java.util.Scanner;

class Greater
 {
  public static void main(String args[])
   {
    Scanner readme = new Scanner(System.in);
    
  
   int a ,b,c;
   System.out.printf("Enter First Number:\n");
   a= readme.nextInt();
   System.out.printf("Enter Second Number:\n");
   b= readme.nextInt();
  System.out.printf("Enter Third Number:\n");
   c= readme.nextInt();
   //System.out.printf("Enter Fourth Number:\n");
   //d= readme.nextInt();
  if ((a>b)&&(a>c))
      System.out.println("True");
      else
      System.out.println("False");
      
  }
 }

