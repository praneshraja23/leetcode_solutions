class Solution {
    public int countOperations(int num1, int num2) {
        return count(num1,num2,0);
    }
    public int count(int n1,int n2,int c){
        if(n1==0 || n2==0){
            return c;
        }
        if(n1>n2){
            return count(n1-n2,n2,++c);
        }
        return count(n1,n2-n1,++c);
    }
}