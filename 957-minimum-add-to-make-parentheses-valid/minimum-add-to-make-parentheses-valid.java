class Solution {
    public int minAddToMakeValid(String s) {
        int close=0,open=0;
        for(char ch:s.toCharArray())
        {
            if('('==ch)
            {
               open++;
            }
            else
            { if(open>0)
                 open--;
              else
                 close++;
            }
        }
        return open+close;
    }
}