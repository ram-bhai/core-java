//Calculate series : 1^2 +2^2 +3^2 +4^2 +.........+n 2
import java.util.Scanner;
class Series{
    private int n;
    public Series(int n){
        this.n = n;
    }

    public void power2Series(){
        int i,sum = 0;
        for(i=1;i<=n;i++){
            sum = sum + (i*i);
        }
        System.out.println("Result : " + sum);
    }
}
class Test{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scan.nextInt();
        scan.close();
        Series s1 = new Series(n);
        s1.power2Series();
    }
}