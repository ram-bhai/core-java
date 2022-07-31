//Write a java program to find largest and smallest number in unsorted array.public class FindBiggestSmallestNumber {

class Max{
 public static void main(String[] args) {
 int numbers[] = new
int[]{33,53,73,94,22,45,23,87,13,63};
 int smallest = numbers[0];
 int biggest = numbers[0];

 for(int i=1;numbers.length; i++)
 {
 if(numbers[i] &gt; biggest)
 biggest = numbers[i];
 else if (numbers[i] &lt; smallest)
 smallest = numbers[i];

 }

 System.out.println(&quot;Largest Number is : &quot; +biggest);
 System.out.println(&quot;Smallest Number
