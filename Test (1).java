/*8)How do you separate zeros and non-zeros in a given Array in java?
	//Sample Input- {0,10,43,27,0,98,75,59,191,0}
	//Sample Output-[10, 43, 27, 98, 75, 59, 191, 0, 0, 0] 
	*/
	
class Test
   {
      public static void main(String args[])
        {
           int a[] = {0,10,43,27,0,98,75,59,191,0};
           int b[] = new int[10];
    
     for(int i=0,l=0,j=a.length,k=0;k<a.length;k++)
      {
        if(a[i]==0)
        {
          b[--j] = a[i++];
        }
      else
        b[l++] = a[i++];
     }
     
       for(int i=0;i<a.length;i++)
         {
            System.out.println(b[i]);
          }
   }
 }
