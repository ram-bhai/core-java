/*Create a class MathOperation with two data member X and Y to store
 the operand and third data member R to store result of operation.
 Create method members
    • init - to input X and Y from user
    • add - to add X and Y and store in R
    • multiply - to multiply X and Y and store in R
    • power - to calculate X Y and store in R
    • display- to display Result R
   */

import java.util.Scanner;  
class MathOperation{
  private int x,y,r;
  
  public void init(){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter first number : ");
    x = scan.nextInt();
    System.out.print("Enter first number : ");
    y = scan.nextInt();
  }
  
  public void add(){
    r = x + y;
  }
  
  public void multiply(){
    r = x * y;
  }
  
  public void power(){
    r = 1;
    while(y!=0){
      r = r * x;
      y--;
    }
  }
  public void display(){
    System.out.println("Result : " + r);
  }
  
}

class Test{
  public static void main(String args[]){
    MathOperation m1 = new MathOperation();
    m1.init();
    m1.add();
    m1.display();
    m1.multiply();
    m1.display();
    m1.power();
    m1.display();
  }
}
