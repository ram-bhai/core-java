import java.util.Scanner;

public class BinarySearch {
    public static void binarySearch(int arr[], int firstnum, int lastnum, int searchElement){
        int middle =(firstnum+lastnum)/2;
        while(firstnum<=middle){
            if(arr[middle]< searchElement){
                firstnum = middle + 1;
            }
            else if(arr[middle] == searchElement){
                System.out.printf("Searching value has been found at position : %d ",(middle+1));
                break;
            }
            else{
                lastnum = middle - 1;
            }
            middle = (firstnum + lastnum)/2;
        }
        if(firstnum > lastnum){
            System.out.println("Searching value not found");
        }
    
        }

        public static void main(String[] args) {
            int arr1 [] = new int[10];
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter 10 values");
            for(int i=0; i<arr1.length;i++){
                if(i==0)
                System.out.printf("Enter %dst value :",(i+1));
                else
                if(i==1)
                System.out.printf("Enter %dnd value :",(i+1));
                else 
                if(i==2)
                System.out.printf("Enter %drd value :",(i+1));
                else 
                System.out.printf("Enter %dth value :",(i+1));
                System.out.print("\n");
                arr1[i] = sc.nextInt();
            }
            int start = 0;
            int end = arr1.length - 1;
            System.out.println("Enter Searching Value :");
            int key = sc.nextInt();
            sc.close();
            binarySearch(arr1, start, end, key);
        }

    }
    
