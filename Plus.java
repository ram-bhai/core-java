//To print plus symbol.

class Plus
   {
      public static void main(java.lang.String args[])
       {
         int i,j;
	  for(i=1;i<=9;i++)
	   {
	      for(j=1;j<=9;j++)
		{
		  if(j==5||i==5)
		  System.out.printf("*");
		  else
		  System.out.printf(" ");
                 }
                 System.out.printf("\n");
                }
            }
        }

