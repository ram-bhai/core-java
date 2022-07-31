//Write a java program to find all possible palindrom of given String.
class Main{
  public static void main(String args[]){
    java.lang.String s1 = "nitin";
    java.lang.String s2 = "";
    char ch;
    for(int i=s1.length()-1;i>=0;i--){
      ch = s1.charAt(i);
      s2 += ch;
    }
    if(s1.equals(s2)){
      System.out.println("palindrome");
    }
    else
      System.out.println("Not palindrome");
  }
}
