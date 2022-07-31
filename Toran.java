// To print a toran.

class Toran
   { 
     public static void main(java.lang.String args[])
       {
         int i,j;
         
          for(i=5; i>=1;i--)
           {
             for(j=1;j<=10;j++)
              {
                  if(j>i&&j<=10-i)
                  System.out.printf(" ");
                else
                 System.out.printf("*");
               }
            System.out.printf("\n");
          }
      }
  }
