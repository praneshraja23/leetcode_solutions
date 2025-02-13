class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        ans=[]
        for i in range(1,len(nums)):
            for j in range(i,len(nums)):
                sum=nums[j-i]+nums[j]
                if sum==target :
                    return [j-i,j]
        return ans
        

        