//Create a class Person with properties (name and age) with following features.
//    • Default age of person should be 18.
//    • A person object can be initialized with name and age.
//    • Method to display name and age of person.

class Person{
  private int age = 18;
  private String name;
  
  public Person(int age,String name){
    this.age = age;
    this.name = name;
  }
  public Person(){}
  
  public void display(){
    System.out.println("Age : " + age);
    System.out.println("Name : " + name);
  }
}
class Test{
  public static void main(String args[]){
    //Person p1 = new Person(22,"cheeku singh");
      Person p2=new Person();
     
    p2.display();
  }
}
