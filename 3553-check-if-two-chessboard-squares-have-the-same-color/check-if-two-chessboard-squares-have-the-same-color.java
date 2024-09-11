class Solution {
    public int find(int row,int col){
         if((row%2==0 && col%2==0)||(row%2==1 && col%2==1)) {
            return 1;
         }
         return 0;
    }
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
       int row1=(int)coordinate1.charAt(1)-48; 
       int col1=(int)coordinate1.charAt(0)-96; 
       int row2=(int)coordinate2.charAt(1)-48; 
       int col2=(int)coordinate2.charAt(0)-96;
       int val1=find(row1,col1);
       int val2=find(row2,col2);
       return val1==val2;
    }
}