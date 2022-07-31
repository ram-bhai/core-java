//12) WAP to find union of two given arrays of type int.
class Union{
    public static void main(String args[]){
        int a[] = {10,20,30,40,50};
        int b[] = {10,50,60,70,20,90};

        int c[] = new int[a.length+b.length];
        int val=0;
        for(int i=0;i<a.length;i++){
            c[val++] = a[i];
        }

        for(int i=0;i<b.length;i++){
            c[val++] = b[i];
        }
        
        int d[] = new int[c.length];
        int count=0;
        boolean flag=true;
        for(int i=0;i<c.length;i++){
            for(int j=0;j<count;j++){
                if(c[i]==d[j]){
                    flag=false;
                    break;
                }
            }
            if(flag){
                d[count++] = c[i];
            }
            flag = true;
        }
        System.out.println("Union of two array : ");
        for(int i=0;i<count;i++){
            System.out.println(d[i]);
        }
    }
}
