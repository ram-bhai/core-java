import java.util.Scanner;

public class Lowercase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string in Uppercase :-");
        java.lang.String input = sc.nextLine();
        char[] ch = input.toCharArray();

        for(int i = 0; i<ch.length;i++){
            if(ch[i]>='A' && ch[i]<='Z'){
                ch[i] = (char)((int)ch[i]+32);
            }
        }
        System.out.println("String is in lower case :- ");
        for(int j=0; j<ch.length;j++){
            System.out.print(ch[j]);
        }
        sc.close();
    }
    
}
