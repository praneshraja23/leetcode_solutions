class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int i:nums)
        {
            pq.add(i);
        }
        long ans=0;
        while(!pq.isEmpty() && k>0)
        {
            int val=pq.poll();
            ans+=val;
            val=(int)Math.ceil(val/3.0);
            pq.add(val);
            k--;
        }
        return ans;
    }
}