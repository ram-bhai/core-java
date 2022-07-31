class Calculator{
    private int firstnum;
    private int secnum;
    public void setData(int f , int s){
        firstnum=f;
        secnum=s;
    }
    public void add(){
        System.out.println("Addition is : "+(firstnum+secnum));
    }
    public void sub(){
        System.out.println("Subtraction is : "+(firstnum-secnum));
    }
    public void multi(){
        System.out.println("Multiplication is : "+(firstnum*secnum));
    }
    public void div(){
        System.out.println("Division is : "+(firstnum/secnum));
    }
}
class Main{
    public static void main(String ram[]){
        Calculator obj =new Calculator();
        obj.setData(20,10);
        obj.add();
        obj.sub();
        obj.multi();
        obj.div();
    }
}