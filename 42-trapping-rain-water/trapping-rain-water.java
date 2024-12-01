class Solution {
    public int trap(int[] height) {
        int tw=0,l=0,r=height.length-1;
        int lhb=height[0],rhb=height[r];
        while(l<=r)
        {
            if(lhb<=rhb)
            {
                if(height[l]>=lhb)
                {
                    lhb=height[l];
                }
                else
                {
                    tw=tw+lhb-height[l];
                }
                l++;
            }
            else
            {
                if(height[r]>=rhb)
                {
                    rhb=height[r];
                }
                else
                {
                    tw=tw+rhb-height[r];
                }
                r--;
            }
        }
        return tw;
    }
}