    import java.util.*;  
    class User1  
    {  
    public static void main(java.lang.String[] args)  
    {  
    Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
    System.out.print("Enter a string: ");  
    java.lang.String str= sc.nextLine();              //reads string
    sc.close();   
    System.out.print("You have entered: "+str);             
    }  
    }  
