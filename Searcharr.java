//Write a Program to search an element in array and also find total occurance of given element and index positions.

class Search{
  public static void main(String args[]){
    int a[] = {10,20,10,40,10,60};
    boolean flag = false;
    int search=10;
    int occ = 0;
    for(int i=0;i<a.length;i++){
      if(search==a[i]){
        flag = true;
        System.out.println(search + " finds at " + (i+1) + " position ");
        occ++;
      }
    }
    if(flag){
      System.out.println(search + " occured " + occ + " times");
    }
    else{
      System.out.println("Element not found...");
    }
  }
}
