//11) Input name of a person and count how many vowels it contains.
import java.util.Scanner;
class Countvowel{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name : ");
        java.lang.String s1 = scan.nextLine();
        char ch;
        int count = 0;
        for(int i=0;i<s1.length();i++){
           ch = s1.charAt(i);
           if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u' || ch =='A' || ch =='E' || ch =='I' || ch =='O' || ch =='U')
                count++;
        }
        System.out.println("Yoyr name contains " + count + " vowels");
    }
}
