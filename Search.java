import java.util.Scanner;

class Search
{

    public void array()
      {
      Scanner sc = new Scanner(System.in);
        int[] a=new a[10];
        System.out.println("Enter the limit of array :");
        int n =sc.nextInt();
        for(int i=0;i<n;i++)
        {
           System.out.printf("Enter %d element in array : \t"+(i+1));
            int a[] =sc.nextInt();
        }
        
        System.out.printf("Enter the searching element :\t");
        int s=sc.nextInt();
        
        for(int i =0;i<n;i++)
        {
          if(a[i]==s)
          {
            System.out.println("Element found");
          }
          else
          {
            System.out.println("Element not found");
          }     
      }
      }     
}

