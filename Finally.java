import java.util.InputMismatchException;
import java.util.Scanner;
class Test{
    public static void main(String args[])
    {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number");
            int a = sc.nextInt();
            System.out.println("Enter second number");
            int b = sc.nextInt();
            System.out.println("Addition is : "+(a+b));
        }
        catch(InputMismatchException e)
        {
            System.out.println("Please enter only integer value");
        }
        finally{
            System.out.println("Finally block of the program....");
        }
    }
}