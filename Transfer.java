import java.util.Scanner;

class Transfer {
  public static void main(java.lang.String args[]) {
    long amount = 0, balance = 10000;
    int account = 0;
    boolean flag = true;
    Scanner sc = new Scanner(System.in);

    if (balance != 0) {
      do {

        // int i=0;
        System.out.println("Enter an account no. to transfer balance :-\t");
        account = sc.nextInt();
        System.out.println("Enter  amount to transfer :-\t");
        amount = sc.nextLong();
        if (amount < balance) {
          System.out.println("Amount transferred successfully.");
          flag = false;

          balance = balance - amount;
          break;
        } else
          System.out.println("Insufficient balance please try again...");
      } while (true);
      System.out.println("Your current balance is :  " + balance);
    } else
      System.out.println("You don't have sufficient balance first deposite some amount..");
  }
}
