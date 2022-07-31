//Pograms for printing pyramid patterns in Java  .
import java.util.Scanner;
class Pyramid{
  private int n;
  public Pyramid(int n){
    this.n = n;
  }
  public Pyramid(){}
  
  public void printPattern(){
    for(int i=n; i>=1;i--){
      for(int j=1;j<=n;j++){
        
		    if(j<i)
		      System.out.print(" ");
		    else
		      System.out.print("*");
		       
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
