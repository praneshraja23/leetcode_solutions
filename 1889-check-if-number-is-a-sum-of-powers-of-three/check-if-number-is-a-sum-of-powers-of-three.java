class Solution {
    public boolean checkPowersOfThree(int n) {
        List<Integer> list=new ArrayList<>();
        list.add(n);
        while(n!=0)
        {   
            int pow=0;
            while(n>0)
            {
                n-=(Math.pow(3,pow++));
            }
            n=n*(-1);
            if(list.contains(n) )
            {
                return false;
            }
            else if(n!=0) list.add(n);
           
        }
        return true;
    }
}