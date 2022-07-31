class Test{
    public int m1(){
        try{
            System.out.println("Try has been executed..");
            System.exit(0);
        }
        catch(Exception e){
            System.out.println("Catch has been executed");
        }
        finally{
            System.out.println("Finally has been executed");
        }
        return 400;
    }

}
class Testmain{
    public static void main(String[] args){
       Test t = new Test();
       t.m1(); 
    }
}