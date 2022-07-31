class Oops{
    private int id;
    private java.lang.String name;
    private float amount;

    public Oops(){}

    public Oops(int id,java.lang.String name,float amount){
        this.id = id;
        this.name=name;
        this.amount = amount;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(java.lang.String name){
        this.name = name;
    }
    public void setAmount(float amount){
        this.amount = amount;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public float getAmount(){
        return amount;
    }
     
}
class Main{
    public static void main(java.lang.String[] args){
        Oops o= new Oops();
        Oops k = new Oops(1002,"Aman",25.5f);
        o.setId(1001);
        o.setAmount(50.0f);
        o.setName("Aman");
        System.out.println("Id : "+(o.getId()));
        System.out.println("Name : "+(o.getName()));
        System.out.println("Amount : "+(o.getAmount()));
        

        
    }
}
