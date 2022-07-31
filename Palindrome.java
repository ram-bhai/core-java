//To check the palindrome of two numbers.
import java.util.Scanner;
class Palindrome
{
public static void main(String args[])
{
Scanner arm = new Scanner(System.in);
int a,res,sum=0,temp=0;

System.out.println("Enter a number :-\t");
 a= arm.nextInt();
  temp=a;
 while(a>0)
 {
 //temp=a;
 res=a%10;
 sum=(sum*10)+res;
 a=a/10;
 }
 
 if(temp==sum)
 System.out.println("True");
 else
 System.out.println("False");
 }
 }
