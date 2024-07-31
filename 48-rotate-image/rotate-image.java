class Solution {
    public void rotate(int[][] matrix) {
        int len=matrix.length;
        int[][] arr=new int[len][len];
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
              int temp=matrix[j][i];
              matrix[j][i]=matrix[i][j];
              matrix[i][j]=temp;
            }
        }
        for(int i=0;i<len;i++){
            for(int j=0;j<len/2;j++){
              int temp=matrix[i][len-1-j];
              matrix[i][len-1-j]=matrix[i][j];
              matrix[i][j]=temp;
            }
        }
    }
}