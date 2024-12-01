class Solution {
    public boolean isMatch(String s, String p) {
        int slen=s.length();
        int plen=p.length();
        char[] ch1=s.toCharArray();
        char[] ch2=p.toCharArray();
        int start1=0,start2=0,star=-1,match=-1;
        
        while(start1<slen)
        {
               
            if(start2<plen &&(ch1[start1]==ch2[start2] ||(start1<slen && ch2[start2]=='?')))
            {
                start1++;
                start2++;
            }
            else if(start2 < plen && ch2[start2]=='*') {
                star = start2++;
                match = start1;
            } else if(star != -1) {
                start2 = star + 1;
                start1 = ++match;
            } else {
                return false;
            }

        }
        while(start2<plen && ch2[start2]=='*')
        {
            start2++;
        }
        
        return start1==slen && start2==plen;
    }
}