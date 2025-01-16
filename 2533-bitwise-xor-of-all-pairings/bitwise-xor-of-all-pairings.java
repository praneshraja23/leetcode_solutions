class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int ans=0;
        int len1=nums1.length;
        int len2=nums2.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<len1;i++)
        {
            int k=0;
            int val=nums1[i];
            if(map.containsKey(val))
            {
                ans=ans^map.get(val);
                continue;
            }
            for(int j=0;j<len2;j++)
            {
                int t=val^nums2[j];
                k=k^t;
            }
            map.put(val,k);
            ans=ans^k;
        }
        return ans;
    }
}