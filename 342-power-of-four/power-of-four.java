class Solution {
    public boolean isPowerOfFour(int n) {
       if(n==1)
       return true;
    //    double s=n;
    //    while(s!=1.0 && s>=4.0){
    //     s/=4;
    //    } 
       return (Math.log(n)/Math.log(4))%1==0;
    }
}