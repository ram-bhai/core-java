import java.util.Scanner;

class Shape
{
public static void main(java.lang.String args[])
{
Scanner sc = new Scanner(System.in);
int i,j,n;
System.out.println("Enter a number of starting:-\t ");
 i=sc.nextInt();
 System.out.printf("Enter a symbol which you want to print :-\t");
 n=sc.nextInt();
 for(;i<=9;i++)
              {
                 for(j=i;j<=9;j++)
                    {
                       if(i==1||j==1||i==9||j==9||i==j||j==(9-i+1))
                       System.out.printf("n");
                     else
                        System.out.printf(" ");
                      }
                       System.out.printf("\n");
                       }
                       }
                       }
