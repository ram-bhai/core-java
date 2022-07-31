/*Create a class Voter(voterId, name, age) with parameterized constructor. 
  The parameterized constructor should throw a checked exception if  age is less than 18.
  The message of exception is “invalid age for voter”.*/ 

import java.util.Scanner;
 class Voter extends Exception
 {
    private int voterId;
    private String name;
    private int age;

     public Voter(int voterId, String name, int age){
       this.voterId = voterId;
       this.name = name;
       this.age = age;
     } 
}
class Main{
    public static void main(java.lang.String[] args) 
    {
      Scanner sc = new Scanner(System.in);
        
    }
}