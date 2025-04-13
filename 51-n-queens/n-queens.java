class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] arr=new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]='.';
            }
        }
        List<List<String>> ans=new ArrayList<>();
        helper(0,arr,n,ans);
        return ans;
    }

    public void helper(int col,char[][] arr,int n,List<List<String>> ans)
    {
        if(col==n)
        { 
            List<String> list=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                String st="";
                for(int j=0;j<n;j++)
                {
                    st+=arr[i][j];
                }
                list.add(st);
            }
            ans.add(list);
            return;
        }
        
        for(int row=0;row<n;row++)
        {
            if(istrue(row,col,arr,n))
            {
                arr[row][col]='Q';
                helper(col+1,arr,n,ans);
                arr[row][col]='.';
            }
            
        }

    }

    public boolean istrue(int row,int col,char[][] arr,int n)
    {
        for(int i=col;i>=0;i--)
        {
            if(arr[row][i]=='Q')
            {
                return false;
            }
        }

        for(int i=row;i>=0;i--)
        {
            if(arr[i][col]=='Q')
            {
                return false;
            }
        }
        int c=col;
        int r=row;
        while(row>-1 && col>-1)
        {
            if(arr[row][col]=='Q')
            {
                return false;
            }
            row--;
            col--;
        }
        while(r<n && c>-1)
        {
            if( arr[r][c]=='Q')
            {
                return false;
            }
            r++;
            c--;
        }

       return true;
    }
}