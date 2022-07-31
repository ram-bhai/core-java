import java.util.Scanner;
 interface Shape 
{
    void Area();
    
}
class Rectangle implements Shape
{
    public void Area()
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the length of rectangle");
      int length = sc.nextInt();
      System.out.println("Enter the width of rectangle");
      int width = sc.nextInt();
      System.out.println("area of rectangle is : "+(length*width));
      sc.close();
    }
} 
class Circle implements Shape
{
    public void Area()
    {
      Scanner sc= new Scanner (System.in);
      System.out.println("Enter the radius of circle");
      float radius = sc.nextFloat();
      System.out.println("Area of circle is :"+(3.14f*radius*radius));
      sc.close();
    }
}
class Triangle implements Shape
{
    public void Area()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of triangle");
        float base =sc.nextFloat();
        System.out.println("Enter the height of triangle");
        float height = sc.nextFloat();
        sc.close();
        System.out.println("Area of triangle :"+(base*height/2));
    }
}
class main
{
    public static void main(String args[])
    {   
        System.out.println("Press 1 to calculate area of triangle.");
        System.out.println("Press 2 to calculate area of circle");
        System.out.println("Press 3 to calculate area of triangle");
        System.out.println("Press 4 to exit");

        Shape obj = new Rectangle();
        Shape obj2 = new Circle();
        Shape obj3 = new Triangle();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please enter your choice :");
        int choice = sc.nextInt();
        sc.close();
        switch(choice)
        {
            case 1: obj.Area();
            break;
            case 2: obj2.Area();
            break;
            case 3: obj3.Area();   
        }
    }
}