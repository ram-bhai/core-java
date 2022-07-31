import java.util.Scanner;

public class SearchinArray {
    public static void main(String[] args) {
        boolean flag = false;
        int array[] = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter only 5 elements :-");
        for(int i =0; i<array.length;i++){
            array[i]= input.nextInt();
        }
        System.out.println("Please enter an element for search");
        int key = input.nextInt();
        input.close();

        for(int j=0; j<array.length; j++){
            if(array[j]==key){
              flag = true;
                break;
            }
               
        }
        if(flag){
            System.out.println("Element is available in Array");
        }
        else{
            System.out.println("Element is not available in Array");
        }
    }
    
}
