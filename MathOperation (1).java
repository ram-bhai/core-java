/*Create a class MathOperation containing method ‘multiply’ to calculate multiplication of following arguments.
    • two integers
    • three float
    • all elements of array
    • one double and one integer.*/
    
    class Multi
    {
       public void multi(int x,int y)
       {
         System.out.println(" Multiplication of two integer values are : "+(x*y));
       }
       
       
       public void multi(float x, float y, float z)
        {
           System.out.println("Multiplication of three float values are :  "+(x*y*z));
        }
        
        public void multi(int a[])
        {  
            int  m=1;
           for(int i=0; i<a.length; i++)
           {
             m=m*a[i];
           }
          System.out.println("Multiplication of array elements are : "+(m));
        }
        
        public void multi(double x, int y)
        {
          System.out.println("Multiplication of double and int value is :  "+(x*y));
        }
   }
   
   class  Main
     {
     public static void main(String args[])
      {
        int a[]={1,2,3,4,5,6};
        Multi m=new Multi();
        m.multi(20,10);
        m.multi(2.5f,3.4f,4.5f);
        m.multi(a);
        m.multi(4.000,4);
       }
     }         
