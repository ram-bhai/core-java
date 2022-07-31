// To print a rectangular star pattern.
 
 class RectangularStar
  {
    public static void main(java.lang.String args[])
     {
       int i,j;
       for(i=9;i>=1;i--)
        {
          for(j=1;j<=9;j++)
           {
              if(i>=1&&j>=1)
               System.out.printf("*");
            else
               System.out.printf(" ");
           }
            System.out.printf("\n");
         }
      }
  }

