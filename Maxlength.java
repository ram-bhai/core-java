// WAP to find word of maximum length in given String.
// 	Sample Input: “Dear Student ,You have need to work hard”
// `	Output: “Student”

class Maxlength{
    public static void main(String args[]){
        java.lang.String s = "Dear Student ,You have need to work hard";
        java.lang.String[] s2 = s.split(" ");
        int maxLen = s2[0].length();
        int maxLen2;
        java.lang.String s3 = s2[0];
        for(java.lang.String element : s2){
            maxLen2 = element.length();
            if(maxLen<maxLen2){
                maxLen = maxLen2;
                s3 = element;
            }    
        }
        System.out.println(s3);
    }
}
