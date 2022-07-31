import java.util.Scanner;
public class fibonacci {
 public static void main(String[] args) {
    int n,a,b,c;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to start fibonacci from :");
    a = sc.nextInt();
    b=a;
    c=b+1;
    System.out.println("Please enter limit for fibonacci elements :");
    n = sc.nextInt();
    sc.close();
    System.out.println("Fibonacci is :- ");
    for(int i = 0; i<n; i++){
        a=b;
        b=c;
        c=a+b;
        System.out.println(a);
    }
 }   
}
