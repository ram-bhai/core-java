
class TestMain{
  public static void main(String args[]){
     java.lang.String s = "100012, Rahil 9009111222 25 indore";
     java.lang.String[] data = s.split(" ");
     if(data[0].equals("100012")){
       System.out.println("Record Found");
     }
     else
       System.out.println("Record Not Found");
     for(java.lang.String info : data){
        System.out.println(info);
     }  
     
  }
}