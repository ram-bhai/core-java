
class Test{
    public static void main(java.lang.String args[]){
        java.lang.String str1 = "Java is my favourite language";
        java.lang.String[] str2 = str1.split(" ");
        java.lang.String reverse = "";
        
        for(int i = 0; i< str2.length; i++){
            java.lang.String temp = str2[i];
            for(int j= temp.length()-1; j>=0; j-- ){
                reverse += temp.charAt(j);
            }
            reverse += " ";
        }
        System.out.println(str1);
        System.out.println(reverse);
    }
}