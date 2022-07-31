//5) WAP  to find duplicate number on Integer array in Java?
class Test{
    public static void main(String args[]){
        int a[] = {10,10,10,20,30,40,10,50,50,20,30};
        int b[] = new int[a.length];
        int count = 0;
        boolean flag = true;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<count;j++){
                if(a[i]==b[j]){
                    flag=false;
                    break;
                }
            }
            if(flag){
                b[count++] = a[i];
            }
            flag = true;
        }
        
        int m = 0;
        for(int i=0;i<count;i++){
            for(int j=0;j<a.length;j++){
                if(b[i] == a[j]){
                    m++;
                }
            }
            if(m>1)
              System.out.println(b[i]);
            m=0;
        }
    }
}