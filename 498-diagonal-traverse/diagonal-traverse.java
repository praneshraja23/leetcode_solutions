class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int[] ans=new int[m*n];
        int row=0,col=0,ind=0;
        boolean up=true;
        while(row<m && col<n)
        {
            if(up)
            {
                while(row>0 && col<n-1)
                {
                    ans[ind++]=mat[row][col];
                    row--;
                    col++;
                }
                ans[ind++]=mat[row][col];
                if(col==n-1){
                    row++;
                }
                else{
                    col++;
                }
            }
            else
            {
                while(row<m-1 && col>0)
                {
                    ans[ind++]=mat[row][col];
                    row++;
                    col--;
                }
                ans[ind++]=mat[row][col];
                if(row==m-1)
                {
                    col++;
                }
                else
                {
                    row++;
                }
            }
            up=!up;
        }
        return ans;
    }
}