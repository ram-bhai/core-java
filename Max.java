//6)How to find largest and smallest number in unsorted array?
class Max{
  public static void main(String args[]){
    int a[] = {10,52,14,32,75,02,56,90,45};
    int max,min;
    max = a[0];
    min = a[0];
    
    for(int i=0;i<a.length;i++){
      if(max<a[i])
        max = a[i];
      else if(min>a[i])
        min = a[i];
    }
    System.out.println("Maximum is : " + max);
    System.out.println("Minimum is : " + min);
  }
}
