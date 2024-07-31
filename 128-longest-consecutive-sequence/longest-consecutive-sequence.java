class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int c=1,max=0;
        if(nums.length<1){
            return 0;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==(nums[i]-1)){
                c++;
            }
            else if(nums[i-1]==nums[i]){
                continue;
            }
            else{
                max=(max<c)?c:max;
                c=1;
            }
        }
        max=(max<c)?c:max;
        return max;
    }
}