import java.util.Scanner;

class Withd {

  public void withdrawal() {
    long amount = 0, balance = 10000;
    Scanner sc = new Scanner(System.in);
    // Withd sc = new withd();
    System.out.println("Enter the amount which you want to withdrawal...");
    amount = sc.nextLong();
    if (amount > balance)
      System.out.println("Insufficient balance...");
    else
      balance = balance - amount;
    System.out.println("Please collect your money....");
    System.out.println("Thank you");
  }
}

class Main {
  public static void main(java.lang.String args[]) {
    // Scanner sc = new Scanner (System.in);
    Withd obj = new Withd();
    obj.withdrawal();
  }
}
