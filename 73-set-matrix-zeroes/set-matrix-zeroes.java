class Solution {
    public void setZeroes(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        boolean[][] arr=new boolean[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
             if(matrix[i][j]==0){
               arr[i][j]=true;
             }
            }
        }
       for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
               if(matrix[i][j]==0){
                if(arr[i][j]==true){
                     setZeroRow(matrix,i,cols,j,arr);
                     setZeroCol(matrix,rows,j,i,arr);

                }
              }
            }
        }
    }       
         
    public void setZeroRow(int[][] matrix,int row,int cols,int col,boolean[][] arr){
        int rows=matrix.length;
        for(int i=0;i<cols;i++){
            // if(matrix[row][i]==0 && i!=col && arr[row][i]==true)
            //  setZeroCol(matrix,rows,i,row,arr);
            if(matrix[row][i]!=0)
             matrix[row][i]=0;
        }
    }
     public void setZeroCol(int[][] matrix,int rows,int col,int row,boolean[][] arr){
        int cols=matrix[0].length;
        for(int i=0;i<rows;i++){
            // if(matrix[i][col]==0 && i!=row && arr[row][i]==true)
            //   setZeroRow(matrix,i,cols,col,arr);
            if(matrix[i][col]!=0)
              matrix[i][col]=0;
        }
    }
}