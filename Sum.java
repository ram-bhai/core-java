//to print a multiplication table 
import java.util.Scanner;
 class Sum
  {
     public static void main(java.lang.String args[])
       {
         Scanner sc=new Scanner (System.in);
         int n,i=1,sum=0;
         System.out.println("Enter a number until you want to sum of all numbers:-");
          n=sc.nextInt();
 
       while(i<=n)
        {
           sum=sum+i;
            i++;
         }
         
         System.out.println(" "+(sum));
         sc.close();
       }
  }
