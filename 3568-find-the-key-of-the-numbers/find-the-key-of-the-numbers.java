class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int ans=Math.min(num1%10,Math.min(num2%10,num3%10));
        num1/=10;
        num2/=10;
        num3/=10;

        for(int i=1;i<4;i++)
        {
            int rem=Math.min(num1%10,Math.min(num2%10,num3%10));
            ans=(int)(Math.pow(10,i))*rem+ans;
            num1/=10;
            num2/=10;
            num3/=10;
        }

        return ans;
    }
}