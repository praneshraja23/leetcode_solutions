class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        if(m*n!=r*c){
            return mat;
        }
        int[][] ans=new int[r][c];
        int sr=0,sc=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(sc<c ){
                    ans[sr][sc++]=mat[i][j];
                }
                else if(sr+1<r){
                    sc=0;
                    sr++;
                    ans[sr][sc++]=mat[i][j];
                }
            }
        }
        return ans;
    }
}