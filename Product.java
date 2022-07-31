/*Create class Product (pid, price, quantity) with parameterized constructor.Create a main function in different class (say XYZ) and perform following task:
    • Accept five product information from user and store in an array
    • Find Pid of product with highest price.
    • Create method (with array of product’s object as argument) in XYZ class to calculate and return total amount spent on all products. (amount spent on single   product=price of product * quantity of product).*/
    
  import java.util.Scanner;
  class Product
   {
     private int pid;
     private int quantity;
     private double price,amount;
     
     public Product(int pid,double price,int quantity)
       {
          this.pid =pid;
          this.price =price;
          this.quantity=quantity;
        }
        
        public int getId()
        {
           return pid;
        }
        
        public double getPrice()
        {
           return price;
        }
        
        public int getQuantity()
        {
           return quantity;
        }
        
        public void display()
          {
            System.out.println("ProductId = "+pid+  "Product price = "+price+  "Product Quantity  ="+quantity);
          }
          
          public double calculate()
          {
             amount = amount + price + quantity;
             return amount;
          }
       }
        class Main
        {
           public static void main(String args[])
            {
              double amount =0;
               Scanner sc= new Scanner(System.in);
               Product pdt[] = new Product[5];
               for(int i=0;i<5;i++)
               {
                 System.out.println("Enter  " +(i+1)+  " Product id");
                 int pid = sc.nextInt();
                 System.out.println("Enter  " +(i+1)+  " Product price");
                 double price = sc.nextDouble();
                 System.out.println("Enter  "  +(i+1)+  " Product quantity");
                 int quantity = sc.nextInt();
                 pdt[i] = new Product(pid,price,quantity);
              }
              
              for(int i=0;i<5; i++)
               {
                 pdt[i].display();
               }
               
               double maxprice = pdt[0].getPrice();
               for(int i=0;i< 5; i++)
                {
                  double a = pdt[i].getPrice();
                  if(a>maxprice)
                  {
                    maxprice =maxprice + a;
                    a= maxprice - a;
                    maxprice =maxprice - a;
                  }
               }
           System.out.println("Max Product price is "+maxprice);
           for(int i=0; i<5; i++)
           {
             amount = amount + pdt[i].calculate();
             }
             System.out.println("Total amount of product is :  "+amount) ;
           }   
         }                
        
        
        
        
        
