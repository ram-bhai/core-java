import java.util.Scanner;
class A {
 public synchronized void addition(B obj){
     System.out.println("Addition method of class A has been executing");
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter first operand : ");
     int firstnum = sc.nextInt();
     System.out.println("Enter second operand : ");
     int secnum = sc.nextInt();
     System.out.println("Addition is : "+(firstnum+secnum));
     sc.close();
     obj.divide();
 }   
 public synchronized void subtraction(){
 System.out.println("Subtraction method of class A has been executed...");
 }
}
class B {
    public synchronized void multiplication(A obj){
        System.out.println("Addition method of class B has been executing");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first operand : ");
        int firstnum = sc.nextInt();
        System.out.println("Enter second operand : ");
        int secnum = sc.nextInt();
        System.out.println("Multiplication is : "+(firstnum*secnum));
        sc.close();
        obj.subtraction();
    }   
    public synchronized void divide(){
    System.out.println("Divide method of class A has been executed....");
    }
   }
   class First extends Thread{
       A aobj;
       B bobj;
       public First(A aobj, B bobj){
           this.aobj = aobj;
           this.bobj = bobj;
       }
       public void run(){
           aobj.addition(bobj);
       }
   }
   class Second extends Thread{
       A aobj;
       B bobj;
       public Second(A aobj,B bobj){
           this.aobj = aobj;
           this.bobj = bobj;
       }
       public void run(){
           bobj.multiplication(aobj);
       }
   }
   class Main{
       public static void main(String[] ram){
           A obj1 = new A();
           B obj2 = new B();
           First t1 = new First(obj1,obj2);
           Second t2 = new Second(obj1,obj2);
            
           t1.start();
           t2.start();
       }
   }
   