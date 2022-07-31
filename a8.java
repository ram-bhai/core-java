//14) WAP check if a String contains only digits?
import java.util.Scanner;
class Checkstr{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String which only contains numbers : ");
        java.lang.String s1 = scan.next();
        char ch;
        boolean flag = true;
        for(int i=0;i<s1.length();i++)
        {
            ch = s1.charAt(i);
            if(!(ch>='0' && ch<='9')){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("String contains only digits ");
        }
        else{
            System.out.println("String does not contains only digits");
        }
    }
}
