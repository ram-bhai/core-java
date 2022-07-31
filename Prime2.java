//Program to check whether number is prime or not
import java.util.Scanner;
class Prime{
  private int n;
  
  public Prime(){}
  
  public Prime(int n){
    this.n = n;
  }
  
  public void primeOrNot(){
    boolean flag = true;
    for(int i=2;i<=n/2;i++){
      if(n%i==0){
        flag = false;
        break;
      }
    }
    if(flag)
      System.out.println("Prime");
    else
      System.out.println("Not Prime");
  }
}

class Test{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a number to check whether it is prime or not : ");
    int n = scan.nextInt();
    scan.close();
    Prime r1 = new Prime(n);
    r1.primeOrNot();
  }
}
