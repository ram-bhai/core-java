import java.util.Scanner;

class Threadex implements Runnable{
    
  public void run(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number : ");
       int num =sc.nextInt();

      for (int i=1;i<=10;i++){
          System.out.printf("%d*%d = %d\n",num,i,num*i);
          
      }
      sc.close();
  }  
}
class Main{
    public static void main(String args[]){
        Runnable obj = new Threadex();
        Thread t = new Thread(obj);
        t.start();
}
}
