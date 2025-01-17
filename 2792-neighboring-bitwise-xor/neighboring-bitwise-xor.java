class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int len=derived.length;
        int[] arr=new int[len];
        int s=0;
        for(int i=0;i<len-1;i++)
        {
            arr[i]=derived[i]^derived[i+1];
            s^=derived[i];
        }
        arr[len-1]=derived[len-1]^arr[0];
        s^=derived[len-1];
        for(int i=0;i<len-1;i++)
        {
            s^=(arr[i]^arr[i+1]);
        }
        s^=(arr[len-1]^arr[0]);
        
        return s==0;
    }
}