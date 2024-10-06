class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] s1=sentence1.split(" ");
        String[] s2=sentence2.split(" ");
        int len1=s1.length;
        int len2=s2.length;
        boolean posibility=true;
        if(len1>len2)
        {
         posibility=check(s1,s2,len1,len2);
        }
        else
        {
         posibility=check(s2,s1,len2,len1);
        }
        return posibility;        
    }
    public boolean check(String[] s,String[] cmp,int len1,int len2)
    {        
        int i=0,j=0;
        while(i<len2 && s[i].equals(cmp[i]))
        {
            i++;
        }
        while (j < len2 && s[len1 - j - 1].equals(cmp[len2 - j - 1])) 
        {
            j++;
        }
        return i+j>=len2;
    }
}