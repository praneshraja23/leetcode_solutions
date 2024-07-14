class Solution {
    public String longestPalindrome(String s) {
        int len=s.length();
        if(len==1){
            return s;
        }
        String str="";
        for(int i=1;i<len;i++){
            String str1=check(s,i-1,i);
            String str2=check(s,i-1,i-1);
            int len1=str1.length();
            int len2=str2.length();
            int max=str.length();
            if(len1>max && len1>len2){
                str=str1;
            }
            else if(len2>max && len2>len1){
                str=str2;
            }
        }
        return str;

    }
    public static String check(String s,int p1,int p2){
        int len=s.length();
        String str="";
        while(p1>=0 && p2<=len-1){
            if(s.charAt(p1)!=s.charAt(p2)){
                break;
            }
            str=s.substring(p1,p2+1);
            p1-=1;
            p2+=1;
        }
        return str;
    }
}