class A{
    static{
        System.out.println("Static block of a");
    }
    {
        System.out.println("Initializer block of a");
    }
    public A(){
        System.out.println("Constructor of a");
    }
}
class B extends A{
    static{
        System.out.println("Static block of b");
    }
    {
        System.out.println("Initializer block of b");
    }
    public B(){
        System.out.println("Constructor of b");
    }
}
class Main{
    public static void main(String[] args){
        System.out.println("Main method");
        B b = new B();
    }
}
