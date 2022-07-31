//Write a java program to print a star pyramid pattern.

class PyramidSecond
   {
     public static void main(String args[])
        {
           //int i=1;
          // int j=9;
          
            for(int i=1;i<=5;i++)
             {
               for(int j=1;j<=9;j++)
               {
                 if((i>=1&&j==1)||(i==2&&j<4)||(i==3&&j<6)||(i==4&&j<8)||(i==5&&j<10))
                 System.out.printf("*");
                 else
                 System.out.printf(" ");
               }  
             System.out.printf("\n");
           }
       }
   }         
