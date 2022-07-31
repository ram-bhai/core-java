import java.util.Scanner;
class Str
  {
     public static void main(java.lang.String args[])
      {
          try (Scanner sc = new  Scanner (System.in)) {
            System.out.printf("Enter a string :- \t");
            java.lang.String s1= sc.nextLine();
            System.out.println("The length of the string  is: \t "+s1.length());
          }
        }
    }
