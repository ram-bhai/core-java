class TestMain{
    public static void main(String args[]){
      java.lang.String s1 = "Infobeans Foundation";
      int x = s1.length();
      System.out.println("Length : "+x);
      
      java.lang.String s2 = s1.toUpperCase(); // INFOBEANS FOUNDATION
      System.out.println(s1); // Infobeans Foundtion
      System.out.println(s2);// INFOBEANS FOUNDATION
    
      java.lang.String s3 = "         Infobeans Foundation        ";
      s3 = s3.trim(); // "Infobeans Foundation"
      java.lang.String s4 = "Infobeans Foundation";
      System.out.println(s3+"$");
      System.out.println(s3 == s4); //false
    }
  }
  
