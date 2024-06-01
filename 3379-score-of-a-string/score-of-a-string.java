class Solution {
    public int scoreOfString(String s) {
        int dif=0,score=0;
       for(int i=1;i<s.length();i++){
        if(s.charAt(i-1)>s.charAt(i)){
            dif=(int)s.charAt(i-1)-(int)s.charAt(i);
        }else{
             dif=(int)s.charAt(i)-(int)s.charAt(i-1);
        }
        score+=dif;
       }return score; 
    }
}