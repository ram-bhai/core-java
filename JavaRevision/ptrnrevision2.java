import java.util.Scanner;

public class ptrnrevision2 {
  
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();
        sc.close();

        for(int i=1; i<=10; i++){
        System.out.printf("%d\n",num*i);
        }
    }
}