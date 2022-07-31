import java.util.Scanner;

public class BinarySearch1 {
    public static void bSearch(int arr[], int firstnum, int lastnum, int key){
        int middle = (firstnum + lastnum)/2;
        while(firstnum<=middle){
            if(arr[middle]<key){
                firstnum = middle + 1;
            }
            else
            if(arr[middle]==key){
                System.out.println("Element found");
                break;
            }
        else{ 
        lastnum = middle -1;
        }
        middle = (firstnum + lastnum)/2; 
        if(firstnum>lastnum){
            System.out.println("Element not found");
        }   
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[] = new int[5];
        System.out.println("Please enter 5 elements only :- ");
        for(int i=0; i<array.length;i++){
            array[i] = input.nextInt();
        }
        int start = 0;
        int last = array.length -1;
        System.out.println("Please enter a value for searching :- ");
        int search = input.nextInt();
        input.close();
        bSearch(array, start, last, search);
    }
    
    
}
