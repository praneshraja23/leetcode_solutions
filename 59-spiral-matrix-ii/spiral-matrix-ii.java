class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans=new int[n][n];
        int c=0,s=0;
        int len=n*n;
        while(c<len)
        {
            for(int i=s;i<n-s;i++){
                ans[s][i]=c+1;
                c++;
            }
            if(c==len)
                break;
            for(int i=s+1;i<n-s;i++){
                ans[i][n-s-1]=c+1;
                c++;
            }
            if(c==len)
                break;
            for(int i=n-s-2;i>=s;i--){
                ans[n-s-1][i]=c+1;
                c++;
            }
            if(c==len)
                break;
            for(int i=n-s-2;i>s;i--){
                ans[i][s]=c+1;
                c++;
            }
            s++;
            
        }
        return ans;
    }
}