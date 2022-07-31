// To print a pattern
class Pattern
    {
        public static void main(java.lang.String args[])
         {
	    int i,j;
            for(i=5;i>=1;i--)
            {
               for(j=5;j>=i;j--)
                { 
                  System.out.printf("%d",j);
                }
               System.out.printf("\n");
            }
        }
   }
