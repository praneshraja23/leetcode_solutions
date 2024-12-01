class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]=='1')
                {
                    count++;
                    helper(grid,i,j);
                }
            }
        }
        return count;
    }
    public void helper(char[][] grid,int row,int col)
    {
        if(row<0 || row>grid.length-1 || col<0 || col>grid[0].length-1)
        {
            return;
        }
        if(grid[row][col]=='1')
          grid[row][col]='0';
        else 
          return;
        helper(grid,row-1,col);
        helper(grid,row+1,col);
        helper(grid,row,col-1);
        helper(grid,row,col+1);
        return;
    }
}