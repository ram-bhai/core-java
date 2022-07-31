// 10) WAP to count the word whose first letter is  vowel.

import java.util.Scanner;
class Count
   {
      public static void main(String args[])
         {
           Scanner scan = new Scanner(System.in);
           System.out.print("Enter a String : ");
           java.lang.String s1 = scan.nextLine();
           java.lang.String[] s2 = s1.split(" ");
           int count = 0;
           for(java.lang.String element : s2)
           {
             if(element.charAt(0) =='a' || element.charAt(0) =='e' || element.charAt(0) =='i' || element.charAt(0) =='o' || element.charAt(0) =='u' || element.charAt(0) =='A' || element.charAt(0) =='E' || element.charAt(0) =='I' || element.charAt(0) =='O' || element.charAt(0) =='U')
              count++;
          }
         System.out.println("Count : " + count);
      }
  }
