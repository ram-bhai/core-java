//To print a hollow Rhombous star pattern.
class HolloRhombous
  {
      public static void main(java.lang.String args[])
       {
          int i,j,space;
           for(i=9;i>=1;i--)
             {
                for(space=1;space<i;space++)
                 System.out.printf(" ");
                  for(j=1;j<=7;j++)
                   { 
                      if(i==9||i==1||j==1||j==7)
                      System.out.printf("*");
                      else
                      System.out.printf(" ");
                   }
                  System.out.printf("\n");
              }
         }
   }
