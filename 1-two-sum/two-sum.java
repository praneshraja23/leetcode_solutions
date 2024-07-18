class Solution {
    public int[] twoSum(int[] nums, int target) 
    {int i=0,j=0;
    int len=nums.length;
    for( i=1;i<len;i++)
      {for( j=i;j<len;j++)
          {if(nums[j-i]+nums[j]==target)
            {
                  return new int[] {j-i,j};
            }
            }
      } 
        return new int[]{}; 
    }
}