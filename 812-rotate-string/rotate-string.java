class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())
        {
            return false;
        }
        char[] ch=s.toCharArray();
        char[] check=goal.toCharArray();
        
        for(int i=0;i<ch.length;i++)
        {
            if(ch[0]==check[i])
            {
               if(checkString(s,goal,i))
               {
                return true;
               }
            }
        }
        return false;
    }
    public boolean checkString(String s, String goal,int i)
    {   int len=s.length();
        int end=len-i;
        if(goal.substring(i,len).equals(s.substring(0,end)))
        {
            if(goal.substring(0,i).equals(s.substring(end,len)))
            {
                return true;
            }
        }
        return false;
    }
}