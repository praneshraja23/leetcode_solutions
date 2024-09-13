class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int len=queries.length;
        int[] ans=new int[len];
        for(int j=0;j<len;j++)
        {   int xor=0;
            for(int i=queries[j][0];i<=queries[j][1];i++)
            {
                xor^=arr[i];
            }
            ans[j]=xor;
        }
        return ans;
    }
}