class Solution {
public:
    int minimumRecolors(string blocks, int k) {
        int w=0,min=INT_MAX;
        int l=0,r=0;
        int len=blocks.length();
        while(r<k)
        {
            if(blocks[r]=='W')
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
            
            if(r<len && blocks[r]=='W')
            {
                w++;
            }
            if(blocks[l]=='W')
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
};