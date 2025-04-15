class Solution {
    public void solveSudoku(char[][] board) {
        helper(0,0,board);
        return ;
    }
    public boolean helper(int row, int col, char[][] board)
    {
            row=(col==9)?row+1:row;
            col=(col==9)?0:col;
            if(row==board.length)
            {
                return true;
            }

            if(board[row][col]=='.')
            {
                for(char val='1';val<='9';val=(char)(val+1))
                {
                    if(!isValid(val,board,row,col))
                    {
                        continue;
                    }
                    board[row][col]=val;
                    if(helper(row,col+1,board))
                    {
                        return true;
                    }
                    board[row][col]='.';
                }
            }
            else
            {
                if(helper(row,col+1,board))
                {
                    return true;
                }
            }
        return false;
    }
    public boolean isValid(char val,char[][] board,int row,int col)
    {
        for(int i=0;i<=8;i++)
        {
            if(board[row][i]==val)
            {
                return false;
            }
        }

        for(int i=0;i<=8;i++)
        {
            if(board[i][col]==val)
            {
                return false;
            }
        }

        int srow=row-(row%3);
        int scol=col-(col%3);
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                char ch=board[srow+i][scol+j];
                if(ch==val)
                {
                    return false;
                }
            }
        }
        return true;
    }
}