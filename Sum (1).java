// Input data exactly in the following format, and print sum of all integer values.
// 	Sample Input: “67, 89, 23, 67, 12, 55, 66”. (Hint use String class split method and Integer class parseInt method)
import java.util.Scanner;
class Sum{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Give some integer values with single space separate");
        String s1 = scan.nextLine();
        String s2[] = s1.split(" ");
        int n,sum = 0;
        for(String element : s2){
            n = Integer.parseInt(element);
            sum+=n;
        } 
        System.out.println("Sum : " + sum);
    }
}
