//To print a pattern from 5 to 1.

class Dataptrn
  {
   public static void main(java.lang.String args[])
    {
        int i,j;
        for(i=5;i>=1;i--)
       {
         for(j=1;j<=i;j++)
         System.out.printf("%d",j);
         System.out.printf("\n");
       }
    }
 }

