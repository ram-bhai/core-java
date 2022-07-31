//11) WAP to remove smallest even element from array.
class Smallesteven{
    public static void main(String args[]){
        int a[] = new int[10];
        a[0] = 5;
        a[1] = 10;
        a[2] = 15;
        a[3] = 20;
        a[4] = 50;

        int max = 2147483647,n=5,pos=n;
        for(int i=0;i<n;i++){
            if((max>a[i]) && ((a[i]%2)==0)){
                max = a[i];
                pos = i;
            }
        }
        if(max==0){
            System.out.println("No such element found.,,");
        }
        else{
            for(int i=pos+1;i<n;i++){
                    a[i-1] = a[i];
            }
            n--;
            System.out.println("Element deleted Successfully ");
            for(int i=0;i<n;i++){
                System.out.println(a[i]);
            }
        }
    }
}
