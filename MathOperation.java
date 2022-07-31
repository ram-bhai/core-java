/*Create a class MathOperation with two data member X and Y to store the operand and third data member R to store result of operation.Create method members
    • init - to input X and Y from user
    • add - to add X and Y and store in R
    • multiply - to multiply X and Y and store in R
    • power - to calculate X Y and store in R
    • display- to display Result R.   */
    
  import java.util.Scanner;
    
    class MathOperation
       {
          private int x;
          private int y;
          public int r;
          
          public void init(int x ,int y)
          {
              this.x=x;
              this.y=y;
             // System.out.println("X is :- \t"+x);
              //System.out.println("Y is :-\t"+y);         
          }
          public void add()
           {
              r= x+y;
             System.out.println("Addition ");
           }   
          public void multi()
             {
                 r=x*y;
                 System.out.println("Multiplication ");
              }
           public void power()
           {
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter base number :- ");
             int base = sc.nextInt();
             System.out.println("Enter number of terms :- ");
             int terms = sc.nextInt();
             long r=1;
             
             while(terms!=0)     
                { 
                   r*=base;
                   --terms; 
                 
                 }
                 System.out.println("Power calculation is "+r);
            }
            
                
            public void display()
             { 
              System.out.println("Result is : "+r);
             }         
      }              
           
          class Main
            {
              public static void main(java.lang.String args[])
               {
                                
		       Scanner sc = new Scanner(System.in);
		       
		       System.out.printf("Enter first number : \t ");
		       int x =sc.nextInt();
		       System.out.printf("Enter second number :-\t ");
		       int y = sc.nextInt();
		       
		       MathOperation m=new  MathOperation();
		       m.init(x,y);
		       m.power();
		       //m.display();
             }  
          }   
         
