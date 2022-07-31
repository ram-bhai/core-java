// WAP to find out total occurrence of each letter in string.
// 	 Sample Input: “aabbccddd”
// 	 Output:   a- 2 times
// 			b- 2 times
// 			c- 2 times
// 			d- 3 times
class Test{
    public static void main(String args[]){
        java.lang.String s1 = "abcdabcdabcddcbadcba";
        java.lang.String s2 = "";
        char ch,ch1;
        boolean flag = true;
        for(int i=0;i<s1.length();i++){
            ch = s1.charAt(i);
            for(int j=0;j<s2.length();j++){
                ch1 = s2.charAt(j);
                if(ch1 == ch){
                    flag = false;
                    break;
                }
            }
            if(flag){
                s2 +=ch;
            }
            flag = true;
        }
        int a[] = new int[s2.length()];
        int count=0;
        for(int i=0;i<s2.length();i++){
            ch = s2.charAt(i);
            for(int j=0;j<s1.length();j++){
                ch1 = s1.charAt(j);
                if(ch1==ch){
                    count++;
                }
            }
            a[i] = count;
            count=0;
        }
        for(int i=0;i<s2.length();i++){
            System.out.println(s2.charAt(i) + " - " + a[i]);
        }
    }
}