class Solution {
    public int minLength(String s) {
        int min=0;
        int len=s.length();
        
            int start=0;
            while(start<len-1)
            {   String t=s.substring(start,start+2);
                if(t.equals("AB") || t.equals("CD"))
                {
                    s=s.substring(0,start)+s.substring(start+2,len);
                    start=(start>0)?start-1:0;
                    len=s.length();
                }
                else{
                    start++;
                }
                
            }
        
        return s.length();
    }
}