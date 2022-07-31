class TestMain{
    public static void main(String arg[]){
      java.lang.String s = "10,20,30,40,50";
      java.lang.String data[] = s.split(",");
      
      int sum = 0;
      for(java.lang.String element : data){
        System.out.println(element);
        int x = Integer.parseInt(element);
        sum = sum + x;
      } 
      System.out.println("Sum : "+sum); 
    }
  }