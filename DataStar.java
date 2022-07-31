//To print data with star pattern.

class DataStar
   {
      public static void main(java.lang.String args[])
        {
            int i,j;
            for(i=1;i<=4;i++)
             {
                for(j=1;j<=i;j++)
                 {
                   if(j==1)
                   System.out.printf("%d",i);
                    else
                      System.out.printf("*%d",i);
                  }
                    System.out.printf("\n");
             }
             
              for(i=3;i>=1;i--)
              {
                for(j=1;j<=i;j++)
                {
                   if(j==1)
                   System.out.printf("%d",i);
                    else
                   System.out.printf("*%d",i);
                 }
                   System.out.printf("\n");
              }
       }
  }

