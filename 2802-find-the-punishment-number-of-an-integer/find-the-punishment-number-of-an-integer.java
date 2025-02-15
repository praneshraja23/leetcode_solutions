class Solution {
    public int punishmentNumber(int n) {
        int ans=0;
        for(int i=1;i<=n;i++)
        {
            int val=i*i;
            String st=""+val;
            int len=st.length();
            if(check(0,0,st,len,i))
            {
                ans+=val;
            }
        }
        return ans;
    }
    public boolean check(int ind,int val,String st,int n,int v)
    {
        if(ind==n)
        {
            if(val==v)
            {
                return true;
            }
            return false;
        }

        for(int i=1;i<=n;i++)
        {
            if(ind+i-1<n)
            {
                int t=Integer.parseInt(st.substring(ind,ind+i));
                boolean c= check(ind+i,val+t,st,n,v);
                if(c)
                {
                    return true;
                }
            }
        }
        return false;
    }
}