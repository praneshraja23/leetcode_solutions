class Solution {
    public boolean isPowerOfFour(int n) {
       if(n==1)
       return true;
       double s=n;
       while(s!=1.0 && s>=4.0){
        s/=4;
       } 
       return s==1.0;
    }
}