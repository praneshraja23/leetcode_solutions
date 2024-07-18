class Solution {
    public int[] twoSum(int[] nums, int target) 
    {int i=0,j=0;
    int len=nums.length;
    for( i=0;i<len;i++)
      {for( j=1;j<len;j++)
          {if(nums[i]+nums[j]==target && i!=j)
            {
                  return new int[] {i,j};
            }
            }
      } 
        return new int[]{}; 
    }
}