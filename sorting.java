// public class sorting {
//     public static void main(String argss[]){
//         int arr []= new int []{10,-1,0,1,20,40,-2};
//         for (int i =0; i<arr.length;i++){
//             for(int j =i+1;j<arr.length;j++){
//                 int temp =0;
//                 if (arr[i]>arr[j]){
//                     temp = arr[i];
//                     arr[i]=arr[j];
//                     arr[j]= temp;
//                 }
//             }
//             System.out.println(arr[i]);
//         }
//     }
    
// }

// import java.util.Scanner;
// public class sorting{
//     public static void main(String[] args) {
//        int a[] = new int[5];  
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter values for sorting :");
//        for(int i=0; i<a.length;i++){
//         a[i]=sc.nextInt();
        
//        }
//        sc.close();

//        System.out.println("Before sorting numbers are : ");
//        for(int j=0;j<a.length;j++){
//         System.out.println(a[j]);
//        }

//        for(int k=0;k<a.length;k++){
//         for(int l=k+1; l<a.length; l++){
//             int temp = 0;
//             if(a[k]>a[l]){
//             temp = a[k];
//             a[k] = a[l];
//             a[l] = temp;
//             }
//         }
//         System.out.println(a[k]);
//     }
       
//     }
// }
import java.util.Scanner;
public class sorting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        for(int i=0; i<a.length; i++){
            System.out.printf("\nEnter %d element :",i+1);
            a[i] = sc.nextInt();
        }
        sc.close();

        for(int j=0; j<a.length; j++){
            for(int k=j+1; k<a.length; k++){
                int temp = 0;
                if(a[j]>a[k]){
                    temp = a[j];
                    a[j] = a[k];
                    a[k] = temp;
                }
            }
            System.out.println(a[j]);
        }
    }
}