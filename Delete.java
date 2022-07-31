// 10) WAP to delete an element from specified position in array.position entered by User using command line argument.
class Delete{
    public static void main(java.lang.String args){
        int a[] = new int[10];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        int n=5,temp;
        int pos = Integer.parseInt(args[0]);
        if(pos>=n){
            System.out.println("Invalid Position");
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
