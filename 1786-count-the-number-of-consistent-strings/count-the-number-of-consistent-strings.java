class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        char[] c2=allowed.toCharArray();
        for(String s:words)
        {   char[] c1=s.toCharArray();
            int n=0;
            for(char ch1:c1)
            {   int c=0;
                for(char ch2:c2)
                {
                    if(ch1==ch2)
                    {
                        c=1;
                    }
                }
                if(c!=1)
                {   n=0;
                    break;
                }
                n=1;
            }
            if(n==1)
                {
                    count+=1;
                }
        }
        return count;
    }
}