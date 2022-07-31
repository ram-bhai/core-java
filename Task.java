interface Task
{
    int Operation(int x,int y);
}
class TestMain
{
   public static void main(String args[])
   {
       Task obj1 = (a,b)->a+b;
       Task obj2 = (a,b)->a-b;
       Task obj3 = (a,b)->{
           if(a>b)
           return a;
           return b;
       };
       int result = obj1.Operation(20,10);
       System.out.println("Addition : "+result);
       System.out.println("Subtraction : "+obj2.Operation(20,10));
       System.out.println("Greater : "+obj3.Operation(20,10));   
   } 
}