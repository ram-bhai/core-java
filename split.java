//Write a java program to reverse each word of String.
	//Sample Input: “Java Is Plateform Independent”
	//Output: “avaJ sI mrofetalP tnednepednI”

class Main{
  public static void main(String args[]){
    java.lang.String s1 = "Java Is Platform Independent";
    java.lang.String[] s2 = s1.split(" ");
    java.lang.String s3 ="";
    char ch;
    for(java.lang.String element : s2){
			for(int i=element.length()-1;i>=0;i--){
			  ch = element.charAt(i);
			  s3+=ch;
			}
			s3+=" ";
    }
    System.out.println(s3);
  }
}                                                                                                 
