//To print week days.

import java.util.Scanner;

class weekDays
{
public static void main(java.lang.String args[])
{
Scanner sc = new Scanner(System.in);
 int n;
 System.out.println("Enter a number from 1 to 7 :\t");
 n= sc.nextInt();
 if(n==1)
 System.out.println("\n First day of week : Monday\n");
 if(n==2)
 System.out.println("\n Second day of week : Tuesday\n");
 if(n==3)
 System.out.println("\n Third day of week : Wednesday\n");
 if(n==4)
 System.out.println("\n Fourth day of week : Thursday\n");
 if(n==5)
 System.out.println("\n Fifth day of week : friday\n");
 if(n==6)
 System.out.println("\n Sixth day of week : saturday\n");
 if(n==7)
 System.out.println("\n Seventh day of week : sunday\n");
 if(n>7)
 System.out.println("\nInvalid input please insert from 1 to 7\n");

}

}
