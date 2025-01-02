class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int len=queries.length;
        int wordLen=words.length;
        int[] ind=new int[wordLen];
        int[] ans=new int[len];
                String str=words[0];
                char st=str.charAt(0);
                char end=str.charAt(str.length()-1);
                if(isVowel(st) && isVowel(end))
                {
                    ind[0]=1;
                }
        for(int i=1;i<wordLen;i++)
        {
                 str=words[i];
                 st=str.charAt(0);
                 end=str.charAt(str.length()-1);
                
                if(isVowel(st) && isVowel(end))
                {
                   ind[i]=1 ;
                }
                 ind[i]+=ind[i-1];

        }
        for(int i=0;i<len;i++)
        {   
            int val=ind[queries[i][1]];
            int j=queries[i][0];
            if(j>0)
            {
                val-=ind[j-1];
            }
            ans[i]=val;
        }
        return ans;
    }
    public boolean isVowel(char ch)
    {
        switch(ch)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;

        }
        return false;
    }
}