//WAP to print all prime numbers between two given numbers.
import java.util.Scanner;
class PrimeSeries{
  //private int n;
  public void prime(int n){
    int i=2;
    boolean flag = true;
    while(i<=n/2){
      if((n%i)==0)
      {
        flag=false;
        break;
      }
      i++;
    }
    if(flag)
        System.out.print(n+" ");
  }
}
class Test{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter start point : ");
    int start = scan.nextInt();
    System.out.print("Enter End point : ");
    int end = scan.nextInt();
    scan.close();
    
    PrimeSeries p1 = new PrimeSeries();
    for(int i=start;i<=end;i++){
      p1.prime(i);
    }
    System.out.println();
  }
}
