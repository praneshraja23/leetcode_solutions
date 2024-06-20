class Solution {
    public boolean isPowerOfThree(int n) {
      if(n<=0)
        return false;
      return find(n);
    }
    public boolean find(double n){
        if(n==1.0){
            return true;
        }
        if(n<1.0){
            return false;
        }
        return find(n/3);
    }
}