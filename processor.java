/*Create an Abstract class Processor with int member variable data and method showData to display data value.
•	Create abstract method process() to define processing of member data.
•	Create a class Factorial using abstract class 	Processor to calculate  and print 	factorial of a number by overriding the process method.
•	Create a class Circle using abstract class Processor to calculate and print area of a circle by overriding the process method Ask user to enter choice (factorial 	or circle area). Also ask data to work upon; Use Processor class reference to achieve this mechanism.
*/
import java.util.Scanner;
abstract class Processor
{
    abstract void process();
    abstract void showData();
}
class Factorial extends Processor
{
    public void process()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
         int fact =1;
        for(int i=1;i<=num;i++)
        {
          fact=fact*i;
        }
        System.out.println("Factorial :"+fact);
    }
        public void ShowData()
        {
            System.out.println("Good morning all of you");
        }
    
}
class Circle extends Processor
{
    public void process()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        float radius = sc.nextFloat();
        float area = 3.14f*radius*radius;
        System.out.println("Area of circle :"+area);
    }
    public void showData()
    {
        System.out.println("Good morning all of you");
    }
}
class Test
{
    public static void main(String args[])
    {
      System.out.println("Press 1 to calculate factorial.");
      System.out.println("Press 2 to calculate area of circle");
     
      Scanner sc = new Scanner(System.in);
       System.out.println("Please enter your choice....");
       int choice = sc.nextInt();
       Processor p = new Factorial();
       Processor p1 = new Circle();
       Switch(choice)
       {
           case 1: p.process();
                   p.showData();
                   break;
           case 2: p1.process();
                   p1.showData();
                   break;
            default: if(choice!=1||choice!=2)
                     System.out.println("Invalid input");
                     break;

       }

    }
}