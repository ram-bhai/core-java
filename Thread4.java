class FirstThread extends Thread{
    public void run(){
        try{
            for(int i=5; i<=5;i++)
            {
                System.out.println("Thread.currentThread().getName()");
                Thread.sleep(2000);
            }
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    
}
class SecondThread extends Thread{
    public void run(){
        try{
            for(int i=5; i<=5;i++)
            {
                System.out.println("Thread.currentThread().getName()");
                Thread.sleep(2000);
            }
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    
}
class Main{
    public static void main(String[] args){
        FirstThread t1 = new FirstThread();
        SecondThread t2 = new SecondThread();
        FirstThread t3 = new FirstThread();

        t1.setName("T1...");
        t2.setName("T2...");
        t3.setName("T3...");

        t1.start();
        t2.start();
        t3.start();
        try{
            for(int i=1; i<=5; i++){
                System.out.println("Main Thread....");
                Thread.sleep(5000);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
