class TestMain{
    public static void main(String args[]){
      String s1 = new String();
      
      String s2 = new String("ABCD");
    
      System.out.println("s1 == s2 : "+(s1==s2));//false
      
      java.lang.String s3 = "ABCD"; // SCP
      java.lang.String s4 = "AB";
      java.lang.String s5 = "AB" + "CD"; //SCP-> ABCD
      
      System.out.println("s3 == s5 : "+(s3 == s5));
      
      java.lang.String s6 = s4 + "CD"; // ABCD -->HEAP
      System.out.println("s3 == s6 : "+(s3 == s6));//false
      
      final java.lang.String s7 = "AB";
      java.lang.String s8 = s7 + "CD"; // ABCD:-SCP
      System.out.println("s3 == s8 : "+(s3 == s8));  
      
      System.out.println("s2 == s6 : "+(s2 == s6));
    }
  }
  