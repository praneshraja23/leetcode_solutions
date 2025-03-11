class Solution {
    public int numberOfSubstrings(String s) {
        int count=0;
        int len=s.length();
        int left=0,right=0;
        int hash[] =new int[3];
        while(right<len)
        {
            char ch=s.charAt(right);
            hash[ch-'a']++;
            while(hash[0]>0 && hash[1]>0 && hash[2]>0)
            {
                count+=len-right;
                hash[s.charAt(left)-'a']--;
                left++;
            }
            right++;
        }
        return count;
    }
}