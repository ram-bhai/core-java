import java.util.Scanner;
public class Pyramin {
    public static void main(String arg[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("How many row in pattern");
  int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.printf("%"+(n+1-i)+"s"," ");
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
