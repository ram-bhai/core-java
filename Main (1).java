//Create an Object having two properties and four behaviours
//(add,substract,multiply,divide) to perform desired operation.object must have setter and getter and keep all properties private.

//import java.util.Scanner;

class Calculator
    {
      private  int a,b;
      public void setA(int a)
      {
        this.a =a;
      }
       public void setB(int b)
      {
        this.b =b;
      }
       public int getA()
      {
        return a;
      }
       public int  getB()
      {
        return b;
      }

public void addition()
{
System.out.println("Addition is :  "+(a+b));
}

public void subtraction()
{
System.out.println("Subtraction is :  "+(a-b));
}

public void multiplication()
{
System.out.println("Multiplication is :  "+(a*b));
}

public void division()
{
System.out.println("Division is :  "+(a/b));
}
}

      class Main
        {
          public static void main(String args [])
            {
               Calculator c=new Calculator();
               c.setA(20);
               c.setB(10);
               c.addition();
               c.subtraction();
               c.multiplication();
               c.division();
           }
      }



