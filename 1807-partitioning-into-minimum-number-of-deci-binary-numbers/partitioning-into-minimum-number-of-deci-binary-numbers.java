class Solution {
    public int minPartitions(String n) {
        int max=0;
        for(char c : n.toCharArray())
        {
            int val=c-48;
            if(val>max)
            {
                max=val;
            }
        }
        return max;
    }
}