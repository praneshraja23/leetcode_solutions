class Solution {
    public void solveSudoku(char[][] board) {
        solver(board);
    }
    public boolean solver(char[][] board)
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]=='.')
                {
                    for(char c='1';c<='9';c++)
                    {
                        if(isValid(board,i,j,c))
                        {
                            board[i][j]=c;
                            if(solver(board))
                            {
                                return true;
                            }
                            else
                            {
                                board[i][j]='.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isValid(char[][] board,int row,int col,char ch)
    {
        for(int i=0;i<9;i++)
        {
            if(board[row][i]==ch || board[i][col]==ch || board[3*(row/3)+(i/3)][3*(col/3)+(i%3)]==ch)
            {
                return false;
            }
        }
        return true;
    }
}