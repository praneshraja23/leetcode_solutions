class Solution {
    public int[] minOperations(String boxes) {
        int len=boxes.length();
        List<Integer> ind=new ArrayList<>();
        for(int i=0;i<len;i++)
        {
            char ch=boxes.charAt(i);
            if(ch=='1')
            {
                ind.add(i);
            }
        }
        int[] ans=new int[len];
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<ind.size();j++)
            {
                ans[i]+=Math.abs(i-ind.get(j));
            }
            
        }
        return ans;
    }
}