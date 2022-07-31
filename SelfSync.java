import java.util.Scanner;
class SelfSync {
    synchronized public void table(){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number : ");
            int num = sc.nextInt();
            sc.close();
            System.out.println(Thread.currentThread().getName()+" in table()");
            for(int i=1;i<=10;i++)
            {
                System.out.printf("%d*%d =%d",num,i,num*i);
                System.out.print("\n");
                Thread.sleep(500);
            }
           // System.out.println(Thread.currentThread().getName()+" in table()");
        }
        catch(Exception e){

        }
    }
    
}
class First extends Thread{
    SelfSync ss;
    public First(SelfSync ss){
      this.ss = ss;
    }
    public void run(){
      ss.table(); 
    }
  }
  class Second extends Thread{
    SelfSync ss;
    public Second(SelfSync ss){
      this.ss = ss;
    }
    public void run(){
      ss.table(); 
    }
  }
  
  class TestMain{
      public static void main(String args[]){
        SelfSync ss = new SelfSync();
      
        First t1 = new First(ss);
        Second t2 = new Second(ss);
      
        t1.setName("First Thread ");
        t2.setName("Second Thread ");
        
        t1.start();
        t2.start();
      }
  }
