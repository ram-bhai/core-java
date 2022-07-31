/*  Create class OneBHK with instance variable roomArea , hallArea and price.
     • Create default and parameterized constructor.
     • Method show(): to print OneBHK data member information.
        Create another class TwoBHK which has all the properties and behaviour of OneBHK and a new instance variable room2Area.
     • Create default and parameterized constructor.
     • Method show(): to print all data member information.
 Write main function in another class(Say XYZ) and store three TwoBHK flat’s.information and print information using show method. Also print total amount of all flats.
*/


class OneBHK{
    int roomArea,hallArea,price;
    public OneBHK(){
        roomArea = 100;
        hallArea = 200;
        price=250000;
    }

    public OneBHK(int roomArea,int hallArea,int price)
     {
        this.roomArea = roomArea;
        this.hallArea = hallArea;
        this.price = price;
     }
     
     public void show()
      {
        System.out.println("Room Area : " + roomArea);
        System.out.println("Hall Area : "+ hallArea);
        System.out.println("Price : " + price);
    }
     public int getPrice()
     {
        return price;
     }
 }
 
class TwoBHK extends OneBHK
   {
      int room2Area;
      public TwoBHK()
       {
         room2Area = 200;
       }
    
    public TwoBHK(int roomArea,int room2Area,int hallArea,int price)
      {
         super(roomArea,hallArea,price);
         this.room2Area = room2Area;
      }
      
     public void show()
     {
        System.out.println("Room 2 Area : " + room2Area);
        super.show();
     }
}

class Test
   {
      public static void main(String args[])
      {  
         TwoBHK t1 = new TwoBHK(200,200,400,200000);
         TwoBHK t2 = new TwoBHK(210,210,420,300000);
         TwoBHK t3 = new TwoBHK(220,220,440,350000);
         System.out.println("\nFirst Flat Info : ");
         t1.show();
        System.out.println("\nSecond Flat Info : ");
        t2.show();
        System.out.println("\nThird Flat Info : ");
        t3.show();

        int totalPrice = 0;
        totalPrice += t1.getPrice();
        totalPrice += t2.getPrice();
        totalPrice += t3.getPrice();
        
        System.out.println("\nTotal price of Three Flats : " + totalPrice);
    }
}
