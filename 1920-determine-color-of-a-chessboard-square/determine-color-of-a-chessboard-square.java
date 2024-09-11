class Solution {
    public int find(int row,int col){
         if((row%2==0 && col%2==0)||(row%2==1 && col%2==1)) {
            return 1;
         }
         return 0;
    }
    public boolean squareIsWhite(String coordinates) {
       int row=(int)coordinates.charAt(1)-48; 
       int col=(int)coordinates.charAt(0)-96; 
       return find(row,col)==0;
    }
}