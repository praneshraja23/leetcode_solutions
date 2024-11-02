class Solution {
    public boolean isCircularSentence(String sentence) {

        int len=sentence.length();
        if(sentence.charAt(len-1)!=sentence.charAt(0))
            {
                return false;
            }
        String[] st=sentence.split(" ");
        for(int i=1;i<st.length;i++)
        {   int l=st[i-1].length()-1;
            if(st[i-1].charAt(l)!=st[i].charAt(0))
            {
                return false;
            }
        }
       return true;
    }
}