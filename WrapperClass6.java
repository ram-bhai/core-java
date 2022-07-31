// pass two values from command line for execution...
class TestMain{
    public static void main(String args[]){
      if(args.length == 2){
        float x = Float.parseFloat(args[0]);
        float y = Float.parseFloat(args[1]);
        System.out.println("Addition : "+(x+y));
      }
      else
      {
        System.out.println("Only and only two element is allowed");
      }
    }
  }