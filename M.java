public class M {
    public Object p1(){
        System.out.println("Parent class method");
        return null;
    }
}
}
    class N extends M {
    public String p1(){
        System.out.println("Child class method");
        return null;
    }
}
class Main{
    public static void main(String args[]){
        M m = new M();
        N n = new N();
        m.p1(); 
        n.p1();
    }
}
