
import java.io.IOException;
import java.util.Scanner;
class Mo{
    public void m1()throws IOException{
       try{ System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(" "+(n*i));
        }
        sc.close();
    }
    catch(Exception e){
        e.printStackTrace();
    }
    }
    
}
class M{
    public void m1()throws IOException{
        System.out.println("Child class method");
    }
}
class Main{
    public static void main(String[] args)throws IOException{
        Mo m = new Mo();
        m.m1();
    }
}