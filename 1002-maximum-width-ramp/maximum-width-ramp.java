class Solution 
{
    public int maxWidthRamp(int[] nums)
    {
        int max=0,len=nums.length;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<len;i++)
         {  if(stack.isEmpty() || nums[stack.peek()]>nums[i])
            {
                stack.push(i);
            }
        }
          for(int j=len-1;j>-1;j--)
            {
                while(!stack.isEmpty() && nums[stack.peek()]<=nums[j])
                {   
                    max=Math.max(max,j-stack.pop());
                   
                }
            }
        return max;
    }
}