/*Create a class that checks 
whether a given number is prime or not using Runnable interface.
*/
import java.util.Scanner;
class ThreadPrime implements Runnable{
  
      public void run(){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a number to check prime or not : ");
          int n = sc.nextInt();
          sc.close();
      boolean flag = true;
      for(int i=2;i<=n/2;i++){
        if(n%i==0){
          flag = false;
          break;
        }
      }
      if(flag)
        System.out.println("Prime");
      else
        System.out.println("Not Prime");
    }
  }
  
  class Test{
    public static void main(String args[]){
        Runnable obj = new ThreadPrime();
        Thread t = new Thread(obj);
        t.start();
     }
}

   
