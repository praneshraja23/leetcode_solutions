class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count=0,len=arr.length;
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                for(int k=j+1;k<len;k++)
                {
                    int f=Math.abs(arr[i]-arr[j]);
                    int s=Math.abs(arr[j]-arr[k]);
                    int t=Math.abs(arr[k]-arr[i]);
                    if(f<=a && s<=b && t<=c)
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}