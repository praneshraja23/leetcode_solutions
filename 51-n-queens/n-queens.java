class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        int[] leftRows=new int[n];
        int[] updiagonal=new int[2*n-1];
        int[] lowerdiagonal=new int[2*n-1];
        char[][] board=new char[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = '.';
        solve(0,ans,board,leftRows,updiagonal,lowerdiagonal,n);
        return ans;
    }
    public void solve(int col,List<List<String>> ans,char[][] board,int[] leftRow,int[] upperdiagonal,int[] lowerdiagonal,int n)
    {
        if(col==n)
        {
            ans.add(change(board,n));
            return;
        }
        for(int i=0;i<n;i++)
        {
            if(leftRow[i]==0 && upperdiagonal[n-1+col-i]==0 && lowerdiagonal[i+col]==0)
            {
                board[i][col]='Q';
                leftRow[i]=1;
                upperdiagonal[n-1+col-i]=1;
                lowerdiagonal[i+col]=1;
                solve(col+1,ans,board,leftRow,upperdiagonal,lowerdiagonal,n);
                board[i][col]='.';
                leftRow[i]=0;
                upperdiagonal[n-1+col-i]=0;
                lowerdiagonal[i+col]=0;

            }
        }
    }
    public List<String> change(char[][] board,int n)
    {
        List<String> s=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            String str=new String(board[i]);
            s.add(str);
        }
        return s;
    }
}