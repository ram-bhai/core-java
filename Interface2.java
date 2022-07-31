//First interface program in java.

interface Davv
 {
   void dressCode();
   void bookLib();
   void compLab();
 }

 class Trs implements Davv
   {
     public void dressCode()
       {
          System.out.println("We are following blue and white uniform.(trs)");
       }
 
 public void bookLib()
   {
      System.out.println("We have a rich library of books.(trs)");
   }
 
 public void compLab()
   {
      System.out.println("We have two big fully updated and AC computer lab.(trs)");
   }
 }
 class Gdc implements Davv
   {
     public void dressCode()
       {
          System.out.println("We are following red and white uniform.(Gdc)");
       }
 
 public void bookLib()
   {
      System.out.println("We have a prosperous library of books.(Gdc)");
   }
 
 public void compLab()
   {
      System.out.println("We have hightech fully updated and AC computer lab.(Gdc)");
   }
 }
   class Test
     {
         public static void main(java.lang.String args[])
           {
              Trs obj = new Trs();
              obj.bookLib();
              Gdc obj1 = new Gdc();
              obj1.bookLib();
            }
      }   
             
   
