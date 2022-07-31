//To print a pattern

class DataPattern
 {
  public static void main(java.lang.String args[])
 {
   int i,j,k=1;
     for(i=1;i<=5;i++)
       {
         for(j=1;j<=i;j++)
         {
           System.out.printf("%d\t",k);
           k++;
         }
         System.out.printf("\n");
        }
     }
   }

