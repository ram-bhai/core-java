//To print a hollow triangle with digits from 1 to 5.

class HollowTriData
   {
       public static void main(java.lang.String args[])
         {
             int i,j;
             for(i=1;i<=5;i++)
              {
                 for(j=1;j<=i;j++)
                 if((i==j)||(i==5)||(j<=1))
                 System.out.printf("%d ",j);
                else
                 System.out.printf("  ");
                 System.out.printf("\n");
              }
                 System.out.printf("\n");
         }
  }

