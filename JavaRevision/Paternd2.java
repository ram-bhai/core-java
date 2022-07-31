// public class Paternd2 {
    import java.util.Scanner;
    public class Paternd2 {
        public static void main(String arg[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("How many row in pattern");
      int n=sc.nextInt();
      sc.close();
            for(int i=1;i<=n;i++){
                System.out.printf("%"+(n+1-i)+"s"," ");
                for(int j=1;j<=i;j++){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
            for(int i=n-1;i>=1;i--){
                System.out.printf("%"+i+"s"," ");
                for(int j=1;j<=i;j++){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }
        
    }
    
 
