class Solution {
    public boolean isHappy(int n) {
        ArrayList<Integer> s=new ArrayList<>();
        while(n!=1 && !(s.contains(n))){
            s.add(n);
            n=truth(n);
        }
        return n==1; 
    }
    public int truth(int n){
         int sum=0;
            while(n>0){
                int r=n%10;
                sum+=r*r;
                n/=10;
            }
            return sum;            
        }
}