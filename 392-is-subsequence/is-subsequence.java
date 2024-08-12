class Solution {
    public boolean isSubsequence(String s, String t) {
        int len_s=s.length();
        int len_t=t.length();
    
        for(int i=0;i<len_s;i++){
            int c=0;
            char ch=s.charAt(i);
            for(int j=0;j<len_t;j++){
                if(ch!=t.charAt(j)){
                    t=t.substring(0,j)+"0"+t.substring(j+1);
               
                }
                else{
                    c=1;
                    t=t.substring(0,j)+"1"+t.substring(j+1);
                    break;
                }
            }
            if(c!=1 || len_t<=0){
                return false;
            }
        }
        return true;
    }
}