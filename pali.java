    
  import java.util.Scanner; 
    
    class PalindromeExample{  
     public static void main(String args[]){
     Scanner read = new Scanner(System.in);  
      int n, r,sum=0,temp;  
      
      System.out.println("Enter a number :-\t");
      n= read.nextInt();  
      //int n=454;//It is the number variable to be checked for palindrome  
      
      temp=n;    
      while(n>0){    
       r=n%10;  //getting remainder  
       sum=(sum*10)+r;    
       n=n/10;    
      }    
      if(temp==sum)    
       System.out.println("palindrome number ");    
      else    
       System.out.println("not palindrome");    
    }  
    }  
