class Solution {
    public int[] plusOne(int[] digits) {
        int rem=0;
        int len=digits.length;
        int i=len-1;
        int val=digits[i]+1;
        digits[i]=val%10;
        rem=val/10;
        i--;
        for(;i>=0;i--)
        {   
            if(rem==0)
               break;
            val=digits[i]+rem;
            digits[i]=val%10;
            rem=val/10;
            
        }
        if(rem>0)
        {
            int[] ans=new int[len+1];
            ans[0]=rem;
            int j=1;
            for(int v:digits)
            {
                ans[j++]=v;
            }
            return ans;
        }

        return digits;
    }
}