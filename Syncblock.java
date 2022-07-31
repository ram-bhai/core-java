import java.util.Scanner;
public class Syncblock{
    public void fact(){
      try{
        synchronized(this){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number : ");
            int n = sc.nextInt();
            int fact =1;
          for(int i=n; i>=1; i--){
              fact= fact*i;
              //System.out.println(fact);
            System.out.println(Thread.currentThread().getName()+" in sync block");
            Thread.sleep(2000);
          }
          System.out.println(fact);
        }
        for(int i=1; i<=5; i++){
          System.out.println(Thread.currentThread().getName()+" outside block");
          Thread.sleep(3300);
        }
      }
      catch(Exception e){
      
      }
    }
  }
  class TestMain{
    public static void main(String... arg){
       Syncblock s = new Syncblock();
       Runnable r1 = ()->{
         s.fact();
       };
      /* Runnable r2 = ()->{
         s.fact();
       };  
       Runnable r3 = ()->{
         s.fact();
       };*/
       Thread t1 = new Thread(r1);
       /*Thread t2 = new Thread(r2);
       Thread t3 = new Thread(r3);
       */
       t1.setName("T1..");
       /*t2.setName("T2..");
       t3.setName("T3..");
       */
       t1.start();
       /*t2.start();
       t3.start();
       */
    }
  }
