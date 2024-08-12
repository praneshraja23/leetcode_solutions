class Solution {
    public String reverseWords(String s) {
     int s_len=s.length();
     String ans="";
     for(int i=s_len-1;i>=0;){
        int start,end,c=0;
        start=end=i;
        while(start>=0 && s.charAt(start)!=' '){
            start--;
            c=1;
        }
        if(c==1){
        ans+=s.substring(start+1,end+1)+" ";
        i=start;}
        else{
            i--;
        }
     }
     ans=ans.substring(0,ans.length()-1);
     return ans;
    }
}