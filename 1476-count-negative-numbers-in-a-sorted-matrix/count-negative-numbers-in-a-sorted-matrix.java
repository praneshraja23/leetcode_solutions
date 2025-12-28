class Solution {
    public int countNegatives(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int r=0;
        int ans=0;
        while(r<row)
        {   
            int c=0;
            while(c<col)
            {
                if(grid[r][c]<0)
                {
                    ans+=col-c;
                    break;
                }
                c++;
            }
            r++;
        }
        return ans;
    }
}