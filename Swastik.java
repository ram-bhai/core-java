//To print a swastik.

class Swastik
   {
    public static void main(java.lang.String args[])
      {
         int i,j;
         
         for(i=1;i<=9;i++)
         {
           for(j=1;j<=9;j++)
            {
              if(i==5||j==5||(i==1&&j>5)||(j==1&&i<5)||(j==9&&i>5)||(i==9&&j<5)||(i==3&&j==3)||(i==3&&j==7)||(i==7&&j==3)||(i==7&&j==7))
               System.out.printf("*");
            else
               System.out.printf(" ");
           }
          System.out.printf("\n");
        }
    }
 }
