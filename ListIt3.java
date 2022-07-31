import java.util.ArrayList;
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
        Employee emp1 = new Employee(1,"Ram",22,"989313");
        Employee emp2 = new Employee(2,"Shyam",23,"989312");
        Employee emp3 = new Employee(3,"Param",24,"989311");
        Employee emp4 = new Employee(4,"Kamal",25,"989310");
        Employee emp5 = new Employee(5,"Mohan",26,"989309");

        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(emp1);
        al.add(emp2);
        al.add(emp3);
        al.add(emp4);
        al.add(emp5);

        for(Employee e : al)
        System.out.println(e.getId()+" "+e.getName()+" "+e.getAge()+" "+e.getMobile());
        
    }
}