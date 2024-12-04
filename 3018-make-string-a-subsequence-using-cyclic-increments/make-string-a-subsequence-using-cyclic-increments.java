class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();
        int len1=ch1.length;
        int len2=ch2.length;
        int i=0,j=0;
        while(j<len1 && i<len2)
        {
            
            if( ch1[j]==ch2[i])
            {
                i++;
                j++;
                continue;
            }
            char c=(ch1[j]=='z')?'a':(char)(ch1[j]+1);
            if(c==ch2[i])
            {
                i++;
            }
            j++;
        }
      return i==len2;
        
    }
}