class Solution {
    public boolean isSubsequence(String s, String t) {
        int len_s=s.length();
        int len_t=t.length();
        int i=0,j=0;
        while(i<len_s && j<len_t){
            if(t.charAt(j)==s.charAt(i)){
                i++;
            }
            j++;
        }
        
            if(len_s!=i){
                return false;
            }
        
        return true;
    }
}