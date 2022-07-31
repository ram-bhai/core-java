/*Create a class Person with properties (name and age) with following features.
    • Default age of person should be 18.
    • A person object can be initialized with name and age.
    • Method to display name and age of person.*/
    import java.util.Scanner;
    class Person
    { 
     private static int age;
   
     public Person()
      {
        age=18;
        this.age =age;
      }
      
     public void display(java.lang.String name)
       {
          System.out.printf("Person name is :\t"+name);
          System.out.printf("\n");
          System.out.printf("Age is :\t "+age);
       }
   }  
     class Main
      {
         public static void main(String args[])
           {
              Scanner sc =new Scanner(System.in);
              Person person =new Person();
              System.out.println("Enter the name of person");
              java.lang.String name = sc.nextLine();
              sc.close();
              //System.out.println("Enter the age of person");
              //String age= sc.nextLine();
              //person.display(name,age);
              person.display(name);
              System.out.println("\n\n");
           }
        } 
