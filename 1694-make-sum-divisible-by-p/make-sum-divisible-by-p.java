class Solution {
    public int minSubarray(int[] nums, int p) {
    
        int len=nums.length;
        long sum=0;
        for(int i=0;i<len;i++)
        {
            sum+=nums[i];
        }
        int rem=(int)(sum%p);
        if(rem==0)
        {
            return 0;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        long prefixSum=0;
        int minlen=len;
        for(int i=0;i<len;i++)
        {
            prefixSum+=nums[i];
            int currentMod=(int)(prefixSum%p);
            int target=(currentMod-rem+p)%p;
            if(map.containsKey(target))
            {
                minlen=Math.min(minlen,i-map.get(target));
            }
            map.put(currentMod,i);
        }
        return minlen==len?-1:minlen;
    }
}