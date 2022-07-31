/*Write a java program to reverse each word of String.
	Sample Input: “Java Is Plateform Independent”
	Output: “avaJ sI mrofetalP tnednepednI”*/
	
	class Reverse
	  {
	    public static void main(String args[])
	      {
	        java.lang.String s1="Java is Platform Independent";
	        
	        StringBuffer sb =new  StringBuffer(s1);
	        sb= sb.reverse();
	        s1=sb.toString();
	        System.out.println(s1);
	     }
	 }
	
