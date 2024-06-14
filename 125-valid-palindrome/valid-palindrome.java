class Solution {
    public boolean isPalindrome(String s) {
        String s1=s.toLowerCase();
        int len=s.length();
        int j=len-1;
        int i=0;
        while(i!=j && i!=len && j>=0){
            char a=s1.charAt(i);
            char b=s1.charAt(j);
           if(a>='a'&& a<='z'|| a>='0'&&a<='9'){
            if(b>='a'  && b<='z'|| b>='0'  && b<='9'){
              if(a==b){
                i++;
                j--;
              }
              else{
                 return false;
              }
           }
           else{
            j--;
           }
           }
           else{
            i++;
           } 
           if(i==j){
               break;
            }
        }
        return true;
    }
}
