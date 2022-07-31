//To print a hollow Inverted pyramid in star pattern.

class HollowPyramid
    {
      public static void main(java.lang.String args[])
        {
          int i,j,space;
          for(i=1; i<=11;i++)
            {
               for(space=1;space<i;space++)
               System.out.printf(" ");
                for(j=11;j>=i;j--)
                 {
                   if(j==11 ||i==1 ||i==j)
                   System.out.printf("* ");
                   else
                   System.out.printf("  ");
                  }
                System.out.printf("\n");
              }
           }
     }
