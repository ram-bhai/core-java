//To calculate area,circumference and diameter of a circle.

import java.util.Scanner;

class Circle
 {
  public static void main(String[] args)
   {
     Scanner readme = new Scanner(System.in);
  
     float pi=3.14f,radius,area,circumference,diameter;
     int choice;
     
     System.out.printf("Press 1 to calculate area of circle:\n");
     System.out.printf("Press 2 to calculate circumference of circle:\n");
     System.out.printf("Press 3 to calculate diameter of circle:\n");
     System.out.printf("Please enter your choice:\n");
     choice = readme.nextInt();
      
      switch(choice)
      {
       case 1:
              System.out.printf("Enter radius of circle:\n");
              radius = readme.nextFloat();
              area = pi*radius*radius;
              System.out.println("Area of circle is = " +area);
              break;
     
      case 2:
             System.out.printf("Enter radius of circle:\n");
             radius = readme.nextFloat();
             circumference = 2*pi*radius;
             System.out.println("Circumference of circle is = " +circumference);
             break;
     
      case 3:
             System.out.printf("Enter radius of circle:\n");
             radius = readme.nextFloat();
             diameter = 2*radius;
             System.out.println("Diameter of circle is = " +diameter);
             break;
         }    
      }
   
 }
