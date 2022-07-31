
 public class threadRevision extends Thread{
 public void run(){
    for(int i=0; i<10; i++){
        System.out.println("Child Thread");
    }
 }

 public class ThreadDemo{
    public static void main(String[] args) {
        threadRevision t = new threadRevision();
        t.start();

        for(int j=0; j<10;j++){
            System.out.println("Main Thread");
        }
    }
 }

    
}
