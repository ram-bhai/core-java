
//      1 
//     2 2
//    3 3 3
//   4 4 4 4
//  5 5 5 5 5
   
   import java.util.Scanner;
    public class NPyramid {
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
        }
        
    }
    
    

