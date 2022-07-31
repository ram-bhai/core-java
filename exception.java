import java.util.Scanner;
import java.util.InputMismatchException;
class Test{
    public static void main(String args[])
    {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number");
            int a = sc.nextInt();
            System.out.println("Enter second number");
            int b = sc.nextInt();
            int c = a/b;
            System.out.println("Result is : "+c);
        }
        catch(ArithmeticException e)
        {
           System.out.println("Denominator must be non zero."); 
        }
        catch(InputMismatchException e)
        {
            System.out.println("Please enter only integer value.");
        }
        
    }

} 