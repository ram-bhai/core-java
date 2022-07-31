class FirstThread extends Thread {
    public void run()
    {
        try{
            for(int i=1;i<=5;i++){
            System.out.println("Cheeeku");
            Thread.sleep(2000);
            }
        }
        catch(InterruptedException e){}
    }
}
class SecondThread extends Thread{
    public void run(){
        try{
            for(int i=1;i<=5;i++)
            {
                System.out.println("Peeku");
                Thread.sleep(3000);
            }
        }
        catch(InterruptedException e){}
    }
}
class Main{
    public static void main(String args[]){
    System.out.println("Main method called....");
    FirstThread t1 = new FirstThread();
    SecondThread t2 = new SecondThread();
    t1.start();
    t2.start();
    }
}
