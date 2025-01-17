class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int len=derived.length;
       
        int s=0;
        for(int i=0;i<len;i++)
        {
            s^=derived[i];
        }
        
        return s==0;
    }
}