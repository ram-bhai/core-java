//Write a java program to print a star pyramid pattern.

class PyramidFirst
   {
     public static void main(String args[])
     {
          
          for(int i=1;i<=5;i++)
          {
            for(int j=1;j<=9;j++)
             {
             
                 if((i>=1&&j==9)||(i==2&&j>6)||(i==3&&j>4)||(i==4&&j>2)||(i==5&&j>=1))
                 System.out.printf("*");
                 else
                 System.out.printf(" ");
               }  
             System.out.printf("\n");
           }
       }
   }         
               
