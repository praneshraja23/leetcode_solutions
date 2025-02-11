class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder b=new StringBuilder(s);
        int c=0;
        int len2=part.length();
        while(c+len2-1<b.length())
        {
            if(b.substring(c,c+len2).equals(part))
            {
                b.delete(c,c+len2);
                c=0;
            }
            else
            {
                c++;
            }
        }
        return b.toString();
    }
}