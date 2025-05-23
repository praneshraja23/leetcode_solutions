class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int len=queries.length;
        int wordLen=words.length;
        int[] ind=new int[wordLen];
        int[] ans=new int[len];
        ind[0]=find(words[0])?1:0;       
        for(int i=1;i<wordLen;i++)
        {
                 
            ind[i]=find(words[i])?1:0; 
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
    public boolean find(String str)
    {
        char st=str.charAt(0);
        char end=str.charAt(str.length()-1);
        return (isVowel(st) && isVowel(end));                   
                
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