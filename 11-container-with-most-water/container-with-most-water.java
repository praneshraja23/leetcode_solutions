class Solution
{
    public int maxArea(int[] height) 
    {
       int len=height.length;
       int left=0,right=len-1;
       int max=0;
       while(left<right)
       {
           int area=Math.min(height[left],height[right])*(right-left);
           if(area>max)
           {
            max=area;
           }
           if(height[left]<height[right])
           {
            left++;
           }
           else{
            right--;
           }

       } 
       return max;
    }
}