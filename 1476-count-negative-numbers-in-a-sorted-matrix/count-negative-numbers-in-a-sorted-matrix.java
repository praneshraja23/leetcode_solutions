class Solution {
    public int countNegatives(int[][] grid) {
        int len_row=grid.length;
        int len_col=grid[0].length;
        int sum=0;
        for(int row=0;row<len_row;row++){
            int s=nums_zero(grid,row,len_col);
            sum+=s;
        }
        return sum;
    }
    public int nums_zero(int[][] grid,int row,int col){
        int start=0,end=col-1;
        if(grid[row][0]<0){
            return col;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(grid[row][mid]<0){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return col-start;
    }
}