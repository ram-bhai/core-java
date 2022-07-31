//Create a class Employee with(empNo ,salary and totalSalary)  with following 	features.
  //  • Only parameterized constructor;
    //• totalSalary always represent total of all the salaries of all employees created.
    //• empNo should be auto incremented.
    //• display total employees and totalSalary using class method.
    
class Employee{
  private int salary,empNo;
  private static int empNos = 0,totalSalary=0;
  
  public Employee(int salary){
    empNo = ++empNos;
    this.salary = salary;
    totalSalary += salary;
  }
  
  public static void display(){
    System.out.println("There are " + empNos + " employees");
    System.out.println("Total Salary : " + totalSalary);
  }
}

class Test{
  public static void main(String args[]){
    Employee e1 = new Employee(2000);
    Employee e2 = new Employee(3000);
    Employee e3 = new Employee(4000);
    Employee e4 = new Employee(5000);
    Employee e5 = new Employee(6000);
    Employee e6 = new Employee(7000);
 		Employee.display();   
  }
}
