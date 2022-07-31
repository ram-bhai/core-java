//Create class OneBHK with instance variable roomArea , hallArea and price.
    //• Create default and parameterized constructor.
    //• Method show(): to print OneBHK data member information.
    
class OneBHK{
  private int price;
  private float roomArea,hallArea;
  
  public OneBHK(){}
  public OneBHK(int price,float roomArea,float hallArea){
    this.price = price;
    this.roomArea = roomArea;
    this.hallArea = hallArea;
  }
  public void show(){
    System.out.println("Price : " + price);
    System.out.println("Room Area : " + roomArea);
   System.out.println("Hall Area : " + hallArea);
  }
}

class Test{
  public static void main(String args[]){
    OneBHK o1 = new OneBHK(25000,1000,1500);
    o1.show();
  }
}


