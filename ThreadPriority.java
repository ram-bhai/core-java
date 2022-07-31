public class ThreadPriority extends Thread{
    public void m1(int start,int end)
    {
        try{
            for(;start<=end;start++)
            {
                System.out.println(start);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
class PrintNumber extends Thread{
ThreadPriority tp;
public PrintNumber(ThreadPriority tp)
{
    this.tp=tp;
}
public void run()
{
    tp.m1(1,10);
}
}
class Main{
    public static void main(String[] args) {
    ThreadPriority tp = new ThreadPriority();
    PrintNumber pt = new PrintNumber(tp);
    pt.start();
}
}
