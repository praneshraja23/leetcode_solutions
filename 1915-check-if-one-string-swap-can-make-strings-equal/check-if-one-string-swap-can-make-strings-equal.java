class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int len1=s1.length();
        int len2=s2.length();
        if(len1!=len2)
        { 
            return false;
        }
        String str1="";
        String str2="";
        for(int i=0;i<len1;i++)
        {
            char ch1=s1.charAt(i);
            char ch2=s2.charAt(i);
            if(ch1!=ch2)
            {
                str1+=""+ch1;
                str2+=""+ch2;
            }
        }
        len1=str1.length();
        len2=str2.length();
        if(len1==0)
        {
            return true;
        }
        if(len1>2 ||len1==1|| str1.charAt(0)!=str2.charAt(1) || str1.charAt(1)!=str2.charAt(0))
        {
            return false;
        }
        return true;
    }
}