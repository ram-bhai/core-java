// WAP check if two Strings are anagrams of each other?
// (Hint Anagram words: LISTEN - SILENT 
class Anagram{
    public static void main(String args[]){
        java.lang.String s1 = "SILENT";
        java.lang.String s2 = "LISTEN";

        int a[] = new int[s1.length()];
        for(int i=0;i<a.length;i++){
            a[i]=-1;
        }
        int ch1,ch2;
        boolean flag = true;
        if(s1.length()==s2.length()){
            for(int i=0;i<s1.length();i++){
                ch1 = s1.charAt(i);
                for(int j=0;j<s2.length();j++){
                    ch2 = s2.charAt(j);
                    if(ch1==ch2){
                        for(int k=0;k<a.length;k++){
                            if(j==a[k]){
                                flag=false;
                                break;
                            }
                            else{

                            }
                        }
                        break;
                    }
                }
            }
        }
    }
}
