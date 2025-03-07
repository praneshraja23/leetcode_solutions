class Solution {
    public int[] closestPrimes(int left, int right) {
        int num1=left,num2=0;
        int[] ans={-1,-1};
        while(num1<=right && !isPrime(num1))
        {
            num1++;
        }
        num2=num1+1;
        while(num2<=right && !isPrime(num2))
        {
            num2++;
        }
        int min=Integer.MAX_VALUE;
        while(num2<=right)
        {
            if((num2-num1)<min)
            {
                min=num2-num1;
                ans[0]=num1;
                ans[1]=num2;
                if(min<=2)
                  return ans;
            }
            num1=num2;
            num2++;
            while(num2<=right && !isPrime(num2))
            {
                num2++;
            }
        }
        return ans;
    }
    public boolean isPrime(int n)
    {
        if (n <= 1)
            return false;

        
        for (int i = 2; i*i<=n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}