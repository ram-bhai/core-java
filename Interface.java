interface I{
    void m1();
    void m2();
    void m3();
}
class Abc implements I{
    public void m1(){
        System.out.println("m1 method of class Abc");
    }
    public void m2(){
        System.out.println("m2 method of class Abc");
    }
    public void m3(){
        System.out.println("m3 method of class Abc");
    }
}
class Main{
    public static void main(String ram[]){
        System.out.println("main method called");
        Abc obj = new Abc();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}