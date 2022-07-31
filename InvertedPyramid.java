//To print a pattern of inverted pyramid.

class InvertedPyramid
 {
     public static void main(java.lang.String args[])
     {
       int i,j;
        for(i=1;i<=5;i++)
         {
           for(j=1;j<=9;j++)
            {
            if((i==1&&j>=1)||(i==2&&j>=2&&j<=8)||(i==3&&j>=3&&j<=7)||(i==4&&j>=4&&j<=6)||(i==5&&j==5))
           System.out.printf("*");
            else
            System.out.printf(" ");
           }
          System.out.printf("\n");
       }
    }
 }

