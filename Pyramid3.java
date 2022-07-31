//Pograms for printing pyramid patterns in Java  .
import java.util.Scanner;
class Pyramid{
  private int n;
  public Pyramid(int n){
    this.n = n;
  }
  public Pyramid(){}
  
  public void printPattern(){
    for(int i=1; i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print(j + " ");
      }
        System.out.println();
    }
    System.out.println();
  }
}

class Test{
  public static void main(String args[]){
 		Scanner scan = new Scanner(System.in);
 		System.out.println("Enter a value");
 		int n = scan.nextInt();
    scan.close();
 		
 		Pyramid p1 = new Pyramid(n);
 		p1.printPattern();
 				   
  }
}
