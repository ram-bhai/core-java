class B{
    static{
        System.out.println("Static block of b");
    }
    {
        System.out.println("Initializer block of b");
    }
    public B(){
        System.out.println("Constructor of b");
    }
    public static void main(String[] args){
        System.out.println("Main method");
        //B b = new B();
    }
}