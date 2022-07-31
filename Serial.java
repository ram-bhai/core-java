//What is Serialization ? Write a java program to store the object into the file.

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
class Employee implements Serializable{
  private int id;
  private String name;
  private String mobile;
  private int age;
  //int serialVersionUID = 1L;
  public Employee(int id, String name, String mobile, int age){
    this.id = id;
    this.name = name;
    this.mobile = mobile;
    this.age = age;
  }
  public Employee(){}
  public int getId
  (){return id;}
  public String getName(){return name;}
  public String getMobile(){return mobile;}
  public int getAge(){return age;}
  public String toString(){
    return id+" "+name+" "+mobile+" "+age;
  }
}
class ReadingObject{
  public static void main(String args[]){
    try{
      FileInputStream fin = new FileInputStream("employee.txt");
      while(true){
      try{ 
        ObjectInputStream ois = new ObjectInputStream(fin);
        Employee c = (Employee)ois.readObject();
        System.out.println(c);//c.toString()
       }
       catch(java.io.IOException e){
         break;
       }
      }
    }
    catch(Exception e){
      e.printStackTrace();
    }
  }
}
class WritingObject{
  public static void main(String ar[]){
    try{
       FileOutputStream fout = 
                new FileOutputStream("employee.txt",true);
       ObjectOutputStream oos =
                new ObjectOutputStream(fout);
        Employee c = new Employee(2,"rajesh","90091133",8);
       
       oos.writeObject(c);
       System.out.println("Operation Success..");
    }
    catch(Exception e){
      e.printStackTrace();
    }
  } 
}