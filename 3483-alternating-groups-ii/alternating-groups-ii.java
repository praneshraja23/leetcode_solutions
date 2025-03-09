class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int count=0,len=colors.length;
        int l=0,r=1;
        while(l<len)
        {
            while((r-l+1)<=k && colors[(r-1)%len]!=colors[r%len])
            {
                r++;
            }
            if(r-l==k)
            {   
                r-=1;
                while(l<len)
                {
                    if(colors[(r-1)%len]!=colors[r%len])
                    {
                        count++;
                    }
                    else
                    {
                        break;
                    }
                    l++;
                    r++;
                }
            }
            else
            {
                l=r;
                r++;
            }
        }       
        return count;
    }
    
}