//Program to reverse a given number
import java.util.Scanner;
class Reverse{
  private int n;
  public Reverse(int n){
    this.n = n;
  }
  public void rev(){
    int m=n,r,s=0;
    while(m!=0){
      r=m%10;
      s=s*10+r;
      m=m/10;
    }
    System.out.println("Reverse is " + s);
  }
}

class Test{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int n = scan.nextInt();
    Reverse r1 = new Reverse(n);
    r1.rev();
  }
}
