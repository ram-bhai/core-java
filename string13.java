class TestMain{
    public static void main(java.lang.String args[]){
      java.lang.String s1 = "Hello";
      
      StringBuffer sb = new StringBuffer(s1);
      sb = sb.reverse(); // StringBuffer
      
      //s1 = sb.toString(); 
      s1 = ""+sb;
      System.out.println(s1);
    }
  }  