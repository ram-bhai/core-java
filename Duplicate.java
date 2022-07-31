//WAP to remove the duplicate letters from given String.
	// Sample Input: “aabbccddd”
	// Output: “abcd”
class Duplicate{
    public static void main(String args[]){
        java.lang.String s1 = "infobeans";
        java.lang.String s2 = "";
        char ch,ch1;
        boolean flag = true;
        System.out.println("Your string is :  "+s1);
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
        System.out.println("After Removing dupicate letters : " + s2);
    }
}
