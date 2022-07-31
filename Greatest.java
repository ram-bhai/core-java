//Program to find greatest in 3 distinct numbers using conditional operator.
import java.util.Scanner;
class Greatest
  {
    public static void main(String args[])
      {
           int a,b,c,temp,result;      
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter first number");
           a=sc.nextInt();
           System.out.println("Enter second number");
           b=sc.nextInt();
           System.out.println("Enter third number");
           c=sc.nextInt();
          
           temp = a>b ? a:b;
           result = c >temp ? c: temp;
           System.out.println("Largest Number is:"+result);
         
      }
      
   }
