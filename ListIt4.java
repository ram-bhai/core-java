import java.util.ArrayList;
import java.util.Scanner;
class Employee{
    private int id;
    private String name;
    private int age;
    private String mobile;

    public Employee(int id,String name,int age,String mobile){
        this.id = id;
        this.name = name;
        this.age = age;
        this.mobile = mobile;
    }
    public Employee(){}
    
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name =name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setMobile(String mobile){
        this.mobile = mobile;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getMobile(){
        return mobile;
    }
}
class TestMain{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
        ArrayList<Employee> al = new ArrayList<Employee>();
        for(int i=1; i<=5;i++){
            System.out.printf("Enter %d Id : ",i);
            int id = sc.nextInt();
            System.out.print("\n");

            System.out.printf("Enter %d name : ",i);
            String name = sc.next();
            System.out.print("\n");

            System.out.printf("Enter %d age : ",i);
            int age = sc.nextInt();
            System.out.print("\n");

            System.out.printf("Enter %d Mobile : ",i);
            String mobile = sc.next();
            System.out.print("\n");

            Employee emp = new Employee(id,name,age,mobile);
            al.add(emp);   
        }
        
        for(Employee e : al)
        System.out.println(e.getId()+" "+e.getName()+" "+e.getAge()+" "+e.getMobile());
        
    }
}