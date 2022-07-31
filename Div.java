import java.util.Scanner;

class Div
 {
  public static void main(String[] args)
   {
    Scanner readme = new Scanner(System.in);
  
   int n1, n2, n3;
   System.out.printf("Enter First Number:\n");
   n1 = readme.nextInt();
   System.out.printf("Enter Second Number:\n");
   n2 = readme.nextInt();
   n3 = n1 / n2;
   
   System.out.println("Division is = " +n3);
  }
 }
