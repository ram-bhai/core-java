import java.util.ArrayList;
import java.util.Scanner;

class Employee{
int empno,salary;
java.lang.String ename;
Employee(int empno,java.lang.String empname,int salary){
this.empno=empno;
this.ename=empname;
this.salary=salary;
}
/*public String toString(){
return empno+"  "+ename+"  "+salary;
}*/
}
class EmployeeDemo
{
    public static void main(java.lang.String args[]){
    int choice =-1;
    Scanner s = new Scanner(System.in);
    ArrayList<Employee> a1 =new ArrayList<Employee>();
     do
      {
       System.out.println("Press 1.  to insert the data.");
       System.out.println("Press 2.  to display the data.");
       System.out.println("Press 0.  to exit.");
       System.out.println("Enter your choice  :-\t");
       choice=s.nextInt();

       switch(choice)
        {
			case 1: System.out.println("How many employee you want :-\t");
			int n = s.nextInt();
			for(int i=0;i<n;i++)
			{ 
			 System.out.println("Enter Employee no : ");
			 int empno=s.nextInt();
			 System.out.println("Enter Employee name : ");
			 java.lang.String empname=s.nextLine();
			 System.out.println("Enter Employee salary: ");
			 int salary=s.nextInt();
          a1.add(new Employee (empno,empname,salary));
         }
          break;
          case 2:  System.out.println(a1);
                   break;          
                  }           
               } while(choice!=0);
               s.close();
    }
    
}
