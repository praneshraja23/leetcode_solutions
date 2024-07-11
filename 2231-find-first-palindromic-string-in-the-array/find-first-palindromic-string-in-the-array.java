class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            String a=words[i];
            boolean s=true;
            for(int j=0;j<a.length()/2;j++){
                if(a.charAt(j)!=a.charAt(a.length()-j-1)){
                    s=false;
                    break;
                }
            }
            if(s){
                return a;
            }
        }return "";
    }
}