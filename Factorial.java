// //To find factorial //
// import java.util.Scanner;


// class Factorial 
// {
// public static void main(java.lang.String args[])
// {
// Scanner sc = new Scanner(System.in);
//   int i,n,f=1;
//  System.out.println("Enter a number :\t");
//   n= sc.nextInt();
//   i=n;
//   while(i>1)
//           {
//            f=i*f;
//            i--;
//           }
//          // System.out.printf("Factorial is:-\t");
//          System.out.println(f);
//         }
// }


import java.util.Scanner;
public class Factorial{
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int i,n,f=1;
                System.out.println("Enter a number :");
                n = sc.nextInt();
                sc.close();
                i = n;
                while(i>1){
                        f=f*i;
                        i--;
                }
                System.out.println(f);
        }
}

