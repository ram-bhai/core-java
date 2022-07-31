//To count how notes are in a given amount//

import java.util.Scanner;

class NoteCount
{
public static void main(java.lang.String args[])
{
 Scanner sc =new Scanner(System.in);
  int amount,temp;
  int n2000=0;
int n500=0;
int n200=0,n100=0,n50=0,n20=0,n10=0,n5=0,n2=0,n1=0;
  System.out.println("Enter amount :-\t");
  amount = sc.nextInt();
  temp=amount;
  
  
if(amount>=1)
            {
		n2000=amount/2000;
		amount=amount-(n2000*2000);

		n500=amount/500;
		amount=amount-(n500*500);
	
		n200=amount/200;
		amount=amount-(n200*200);

		n100=amount/100;
		amount=amount-(n100*100);

		n50=amount/50;
		amount=amount-(n50*50);

		n20=amount/20;
		amount=amount-(n20*20);

		n10=amount/10;
		amount=amount-(n10*10);

		n5=amount/5;
		amount=amount-(n5*5);

		n2=amount/2;
		amount=amount-(n2*2);
	
		n1=amount;

		System.out.println("amount contains\n"+temp);

if(n2000)
	System.out.println("notes of 2000\n"+n2000);

if(n500)
	System.out.println("notes of 500\n"+n500);

if(n200)
	System.out.println("notes of 200\n"+n200);

if(n100)
	System.out.println("notes of 100\n"+n100);

if(n50)
	System.out.println("notes of 50\n"+n50);

if(n20)
	System.out.println("notes of 20\n"+n20);

if(n10)
	System.out.println("notes of 10\n"+n10);

if(n5)
	System.out.println("notes of 5\n"+n5);

if(n2)
	System.out.println("notes of 2\n"+n2);

if(n1)
	System.out.println("notes of 1\n"+n1);

}

else
System.out.println("\nInsufficient balance\n");

}
}
