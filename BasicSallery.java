//To calculate basic sallery of an employee//

import java.util.Scanner;

class BasicSallery
{
 public static void main(java.lang.String args[])
 {
 Scanner sc =new Scanner (System.in);
 long bs;
 float hra,da,gs;
 
 //unsigned int bs;
 System.out.println ("Enter the basic sallery of the employee :\t");
 bs=sc.nextLong();
 if(bs<=10000)
           {
             hra=bs*20/100.0f;
             da=bs*80/100.0f;
             gs=bs+hra+da;
         System.out.println   ("Gross sallery is :-"+gs);
             System.out.println("hra is :-"+hra);
            System.out.println("da is :-"+da);
           }
  
  
if(bs>10000&&bs<=20000)
                {
                  hra=bs*25/100.0f;
                  da=bs*90/100.0f;
                  gs=bs+hra+da;
                  System.out.println   ("Gross sallery is :-"+gs);
                 System.out.println("hra is :-"+hra);
                 System.out.println("da is :-"+da);
                  
                }
 
 
 if(bs>20000)
            {
 	      hra=bs*30/100.0f;
	      da=bs*95/100.0f;
              gs=bs+hra+da;
              System.out.println   ("Gross sallery is :-"+gs);
             System.out.println("hra is :-"+hra);
            System.out.println("da is :-"+da);
            }
}
}
