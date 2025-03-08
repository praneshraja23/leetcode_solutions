class Solution {
    public int minimumRecolors(String blocks, int k) {
        int w=0,min=Integer.MAX_VALUE;
        int l=0,r=0;
        int len=blocks.length();
        while(r<k)
        {
            if(blocks.charAt(r)=='W')
            {
                w++;
            }
            r++;
        }
        if(w<min)
        {
            min=w;
        }
        
        while(r<len)
        {
            
            if(r<len && blocks.charAt(r)=='W')
            {
                w++;
            }
            if(blocks.charAt(l)=='W')
            {
                w--;
            }
            l++;
            r++;
            if(w<min)
            {
                min=w;
            }
        }
        return min;   
    }
}