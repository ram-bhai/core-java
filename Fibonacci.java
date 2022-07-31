//To print a fibonacci series//

import java.util.Scanner;

class Fibonacci
{
public static void main(java.lang.String args[])
{
Scanner sc =new Scanner(System.in);
  int a,b,c,n;
  a=-1;
  b=1;
 System.out.println("Enter limit :\t");
 n=sc.nextInt();

 do 
 {
  c=a+b;
 System.out.println(c);
  a=b;
  b=c;
  n--;
 }
while(n!=0);
}
}


