//12) WAP to find intersection of two given arrays of type int.
class Test{
    public static void main(String args[]){
        int a[] = {10,20,30,40,50};
        int b[] = {10,50,60,70,20,90,10};

        int c[] = new int[a.length+b.length];
        int val=0;
        for(int i=0;i<a.length;i++){
            c[val++] = a[i];
        }
        for(int i=0;i<b.length;i++){
            c[val++] = b[i];
        }

        boolean flag=true;
        int count=0;
        int d[] = new int[c.length];
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
        
        int m = 0;
        for(int i=0;i<count;i++){
            for(int j=0;j<c.length;j++){
                if(d[i] == c[j]){
                    m++;
                }
            }
            if(m>1)
              System.out.println(d[i]);
            m=0;
        }
    }
}