class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        int len=words.length;
        for(int i=0;i<len-1;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(isPrefixAndSuffix(words[i],words[j]))
                {
                    count++;
                }
            }
        }
        return count;
    }
    public boolean isPrefixAndSuffix (String str1,String str2)
    {
        int len1=str1.length();
        int len2=str2.length();
        if(len1<=len2)
        {
            boolean prefix=(str1.equals(str2.substring(0,len1)));
            boolean suffix=(str1.equals(str2.substring(len2-len1,len2)));
            if(prefix && suffix)
                return true;
        }
        return false;
    }
}