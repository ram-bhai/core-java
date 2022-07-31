//To print diamond star pattern.


class Diamond
   {
        public static void main(java.lang.String args[])
           {
               int i,j,space;
                for(i=11;i>=1;i--)
                 {
                     for(space=1;space<i;space++)
                     System.out.printf(" ");

                       for(j=11;j>=i;j--)
                        System.out.printf("* ");

                        System.out.printf("\n");
                   }

                       for(i=1;i<=11;i++)
                       {
                          for(space=1;space<i;space++)
                          System.out.printf(" ");

                          for(j=11;j>=i;j--)
                          System.out.printf("* ");

                          System.out.printf("\n");
                      }
             }
       }
