import java.util.Scanner;
public class Uppercase {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string in lowercase :-");
        java.lang.String str = sc.nextLine();
        char[] ch = str.toCharArray();
        for(int i=0; i<ch.length; i++){
            if(ch[i]>='a' && ch[i]<='z'){
                ch[i] = (char)((int)ch[i]-32);
            }
        }
        System.out.println("String is in UpperCase :- ");
        for(int j=0; j<ch.length;j++){
            System.out.print(ch[j]);
        }
        sc.close();
        }
    
}
