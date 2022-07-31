//To check negative or positive //
import java.util.Scanner;

class Sign
{
public static void main(java.lang.String args[])
{
Scanner sc = new Scanner(System.in);
 int i;
 {
 System.out.println("Enter a number :\t");
  i= sc.nextInt();
  if(i>0)
       System.out.println("Number is positive\n\n");
   else
       System.out.println("Number is negative\n\n");

   if(i==0)
       System.out.println("Zero is neither positive nor negative\n\n");
  }
}
}

