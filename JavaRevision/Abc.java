import java.util.Scanner;

public class Abc {
    // public static void main(String[] args) {
    //     Scanner ab = new Scanner(System.in);
    //     System.out.println("Please type a sentence :");
    //     String str1 = ab.nextLine();
    //     ab.close();
    //     String str2[] = str1.split(" ");
    //     String reverse = "";

    //     for(int i=0; i<str2.length; i++){
    //         String temp = str2[i];
    //         for(int j = temp.length()-1;j>=0; j--){
    //             reverse += temp.charAt(j);
    //         }
    //         reverse += " ";
    //     }
    //     //System.out.println(str1);
    //     System.out.println(reverse);
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter only one string");
        java.lang.String str1 = sc.nextLine();
        sc.close();

        char chars[] = str1.toCharArray();
        for(int i= chars.length-1;i>=0;i--){
            System.out.print(chars[i]);
            
        }
    }

    }