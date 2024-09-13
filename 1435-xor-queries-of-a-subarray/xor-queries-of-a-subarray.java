class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int len=queries.length;
        int[] ans=new int[len];
        for(int j=0;j<len;j++)
        {   if(queries[j][0]==queries[j][1])
            {
                ans[j]=arr[queries[j][0]];
                continue;
            }
            for(int i=queries[j][0];i<=queries[j][1];i++)
            {
                ans[j]^=arr[i];
            }
        }
        return ans;
    }
}