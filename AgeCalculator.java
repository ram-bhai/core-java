import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
class AgeCalculator {
   public static void main(java.lang.String [] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your date of birth[dd/mm/yyyy]:- ");
       java.lang.String dob=sc.nextLine();
       String arr[]= dob.split("/");
       int d= Integer.parseInt(arr[0]);
       
   } 
}
