class PyramidThird
   {
     public static void main(String args[])
     {
          
          for(int i=1;i<=5;i++)
          {
            for(int j=1;j<=5;j++)
             {
             
                 if((i==1&&j==5)||(i==2&&j>3)||(i==3&&j>2)||(i==4&&j>1)||(i==5&&j>=1))
                 System.out.printf("*");
                 else
                 System.out.printf(" ");
               }  
             System.out.printf("\n");
           }
       }
   }         
               
