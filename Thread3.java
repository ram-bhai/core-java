
import java.util.Scanner;
class Thread3 extends Thread{
    public void run(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=s.nextInt();
        s.close();
        System.out.printf("Table of %d",n);
        System.out.print("\n");
        try{
        for(int i=1;i<=10;i++){
         System.out.println(""+(n*i));
         Thread.sleep(2000);
        }
    }
    catch(InterruptedException e){

    }

    }
    
}
class Main{
    public static void main(String args[])
    {
        Thread3 t = new Thread3();
        t.start();
    }
}