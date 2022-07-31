class Str1
  {
    public static void main(String args[])
      {
         int x=1234;
         java.lang.String s= " "+x;
         StringBuffer sb = new StringBuffer(s);
         s= sb.reverse()+" ";
         x=Integer.parseInt(s);
         System.out.println(x);
      }
   }
