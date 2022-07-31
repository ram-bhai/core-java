//To check a year is leap or not.
import java.util.Scanner;
 class Leap
 {
 public static void main(String args[])
 {
 Scanner leap = new Scanner (System.in);
 int a,flag=0,res,temp;
 System.out.println("Enter a year :-\t");
 a = leap.nextInt();
 temp=a;


 while(a!=0)
 {
 res=a%10;
 flag=flag+1;
 a=a/10;
}

 
if(flag>4)
{
  System.out.println("Invalid input Please re-enter  :-");
  System.out.println("For Year only 4 digits are allowed ");
}

 else
 if(a%4==0)
    System.out.println("This is a leap year.");
 else
 System.out.println("This is not a leap year");
 }
 }
 
