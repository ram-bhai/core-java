        
class Str2{
  
    public static  boolean
    check(java.lang.String str, int n)
    {
        for (int i = 0; i < n;)
        {
            if (str.charAt(i) >= '0'&& str.charAt(i) <= '9') 
                {
                   return true;
                }
            else 
            {
                return false;
            }
      }
        return false;
    }
  
    public static void main(String args[])
    {
        java.lang.String str = "hello";
        int n = str.length();
        System.out.println(check(str, n));
    }
}
        

