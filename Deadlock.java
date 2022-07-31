class A{
    public synchronized void m1(B obj){
        System.out.println("M1 method of class A has been executed...");
        obj.p2();
    }
    public synchronized void p1(){
        System.out.println("P1 method of class A has been executed...");
    }
    
}
class B{
    public synchronized void m1(A obj){
        System.out.println("M1 method of class B has been executed...");
        obj.p1();
    }
    public synchronized void p2(){
        System.out.println("P1 method of class B has been executed...");
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
        aobj.m1(bobj);
    }
}
class Second extends Thread{
    A aobj;
    B bobj;

    public Second(A aobj, B bobj){
        this.aobj = aobj;
        this.bobj = bobj;
    }
    public void run(){
        bobj.m1(aobj);
    }
}
class Main{
    public static void main(String[] args){
        A a1 = new A();
        B b1 = new B();
        First t1 = new First(a1,b1);
        Second t2 = new Second(a1,b1);
        t1.start();
        t2.start();
    }
}