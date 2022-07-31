import java.util.Scanner;

class Result
 {
  public static void main(String args[])
   {
    Scanner result = new Scanner(System.in);
    
     float percent,total;
     int hindi,english,physics,chemistry,biology,obt;
    
     System.out.println("Enter marks of hindi:");
     hindi = result.nextInt();
     
     System.out.println("Enter marks of english:");
     english = result.nextInt();
     
     System.out.println("Enter marks of Physics:");
     physics = result.nextInt();
     
     System.out.println("Enter marks of Chemistry:");
     chemistry = result.nextInt();
     
     System.out.println("Enter marks of Biology:");
     biology = result.nextInt();
     
     obt=hindi+english+physics+chemistry+biology;
     
     System.out.println("Obtained mark in:"+obt);
     
     System.out.println("Enter marks of grandtotal:");
     total = result.nextFloat();
     
     percent=obt/total*100;
     
     System.out.println("\nPercent is:"+percent);
    }
     
  }  
     
