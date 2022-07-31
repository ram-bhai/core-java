/*Create a class Employee with(empNo ,salary and totalSalary)  with following 	features.
    • Only parameterized constructor;
    • totalSalary always represent total of all the salaries of all employees created.
    • empNo should be auto incremented.
    • display total employees and totalSalary using class method.*/
   import java.util.Scanner;
   class Employee
      {
        private double salary;
        private static double  total;
        private static int empno =0;
        
        
        public Employee(double salary)
        {
           this.salary = salary;
           this.total =  total+salary;
           empno++;
        }
        
        public static void display()
         {
           System.out.println("Total employee : "+empno);
           System.out.println("Total salary : "+total);
          }
       }
          class Main
           {
             public static void main(String args[])
             {
                 Employee emp =new Employee(10000);
                 Employee emp1 =new Employee(5000);
                 Employee emp2 =new Employee(2000);
                 Employee emp3 =new Employee(20000);
                 Employee emp4 =new Employee(30000);
                 Employee.display();
              }
           } 
