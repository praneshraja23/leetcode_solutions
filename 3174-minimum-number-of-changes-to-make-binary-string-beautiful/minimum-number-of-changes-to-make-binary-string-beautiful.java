class Solution {
    public int minChanges(String s) {
        char[] ch=s.toCharArray();
        int count=0;
        for(int i=1;i<ch.length;i+=2)
        {
            if(ch[i-1]!=ch[i])
            {
                count++;
            }
        }
        return count;
    }
}