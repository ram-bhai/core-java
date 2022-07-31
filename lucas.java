// Calculate sum of Lucas series (up to 10 terms) :
//         1, 2, 3, 6, 11, 20 ,........
class Series
   {
      public void lucas()
        {
           int i=1,j=3,sum=0,n=10;
            while(n!=0)
             {
                System.out.printf(i + " ");
                 sum = i+j;
                 i=j;
                 j=sum;
                 n--;
           }
         System.out.println();
         System.out.println("Result : " + sum);
      }
  }
class Test
  {
    public static void main(String args[])
       {
         Series s1 = new Series();
         s1.lucas();
      }
   }
