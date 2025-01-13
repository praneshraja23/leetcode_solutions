class Solution {
    public int minimumLength(String s) {
        int sum=0;
        int[] check=new int[26];
        for(char ch:s.toCharArray())
        {
            sum+=1;
            check[ch-97]+=1;
            if(check[ch-97]==3)
            {
                sum-=2;
                check[ch-97]-=2;
            }
        }
        return sum;
    }
}