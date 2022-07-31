/*Create a Thread class to print following star(*) pattern on screen
 with delay of 1 second between each * print. 
 Number of lines in the pattern should be passed to the constructor of Thread class.
	* * * * *
	* * * *
	* * *
	* *
	*
*/
class ThreadAssign extends Thread {
   public void pattern(int num)
   {
      try{
        for(int i=num; i>=1; --i)
        {
            for(int j=1;j<=i;++j){
                System.out.print("* ");
                Thread.sleep(1000);
            }
            System.out.print("\n");
      } 
       }
       catch(Exception e){
           e.printStackTrace();
       }
   } 
}

class Trial extends Thread{
    
        ThreadAssign ta;
        public Trial(ThreadAssign ta){
            this.ta=ta;
        }
        public void run(){
            ta.pattern(5);
        }
}
class Main{
    public static void main(String[] args)
    {
        ThreadAssign ta = new ThreadAssign();
        Trial t = new Trial(ta);
        t.start();

    } 
}