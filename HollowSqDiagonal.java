//To print a hollow square star pattern with diagonal.

 class HollowSqdiagonal
    {
      public static void main(java.lang.String args[])
          {
             int i,j;
             for(i=1;i<=9;i++)
              {
                 for(j=1;j<=9;j++)
                    {
                       if(i==1||j==1||i==9||j==9||i==j||j==(9-i+1))
                       System.out.printf("*");
                     else
                        System.out.printf(" ");
                      }
                       System.out.printf("\n");
               }
          }
     }

