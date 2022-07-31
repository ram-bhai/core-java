/*Create a class MathOperation containing method ‘multiply’
  to calculate multiplication of following arguments.
    • two integers
    • three float
    • all elements of array
    • one double and one integer
    */
import java.util.Scanner;
class MathOperation{
  public void multiply(int a,int b){
    int res = a * b;
    System.out.println("Multiplication of two integer : " + res);
  }
  public void multiply(float a, float b,float c){
    float res = a * b * c;
    System.out.println("Multiplication of three floating point numbers : " + res);
  }
  public void multiply(int a[]){
    int sum = 1;
    for(int i=0;i<a.length;i++){
      sum = sum * a[i];
    }
    System.out.println("Multiplication of array : " + sum);
  }
  public void multiply(int a,double b){
    double res = a*b;
    System.out.println("Multiplication of double and integer : " + res); 
  }
}

class Test{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter two integer number : ");
    int a = scan.nextInt();
    int b = scan.nextInt();
    
    MathOperation m1  = new MathOperation();
    m1.multiply(a,b);
		
		System.out.println("Enter three floating point numbers : ");
		float f1 = scan.nextFloat();
		float f2 = scan.nextFloat();
		float f3 = scan.nextFloat();
		
		m1.multiply(f1,f2,f3);
		
		System.out.print("Enter the limit of array : ");
		int n = scan.nextInt(); 
		int arr[] = new int[n];
		
		System.out.print("Enter the elements in array : ");
		for(int i=0;i<arr.length;i++){
		  arr[i] = scan.nextInt();
		}
		
		m1.multiply(arr);
		
		System.out.println("Enter a integer and a double number : ");
		int i1 = scan.nextInt();
		double d = scan.nextDouble();
		m1.multiply(i1,d);

  }
}
