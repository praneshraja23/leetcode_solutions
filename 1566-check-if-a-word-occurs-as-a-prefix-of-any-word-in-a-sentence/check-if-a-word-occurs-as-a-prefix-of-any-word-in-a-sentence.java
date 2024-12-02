class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] st=sentence.split(" ");
        int len=st.length;
        int n=searchWord.length();
        for(int i=0;i<len;i++)
        {
            int s=st[i].length();
            if(s>=n && st[i].substring(0,n).equals(searchWord))
            {
                return i+1;
            }
        }
        return -1;
    }
}