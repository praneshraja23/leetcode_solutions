class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        List<Integer> list=new ArrayList<>();
        int s=0;
        int c=0;
        int len=m*n;
        while(c<len){
            for(int i=s;i<n-s;i++)
            {
                list.add(matrix[s][i]);
                c++;
            }
            if(c==len)
            {
                break;
            }
            for(int i=s+1;i<m-s;i++)
            {
                list.add(matrix[i][n-s-1]);
                c++;
            }
            if(c==len)
            {
                break;
            }
            for(int i=n-s-2;i>=s;i--)
            {
                list.add(matrix[m-s-1][i]);
                c++;
            }
            if(c==len)
            {
                break;
            }
            for(int i=m-s-2;i>s;i--)
            {
                list.add(matrix[i][s]);
                c++;
            }
            s++;
        }
        return list;
    }
}