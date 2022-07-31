// to print a multiplication table 
import java.util.Scanner;
 class Table
     {
        public static void main(java.lang.String args[])
         {
           Scanner sc=new Scanner (System.in);
            int n,i=1;
            System.out.println("Enter a number to print that table :-");
            n=sc.nextInt();
            
            
            while(i<=10)
            {
              System.out.println(" "+(n*i));
                i++;
            }
           
           sc.close();
        }
   }
