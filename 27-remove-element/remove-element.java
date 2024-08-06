class Solution {
    public int removeElement(int[] nums, int val) {
        int first=0;
        int last=nums.length-1;
       
        while(first<=last){
            while(last>=0 && nums[last]==val){
                last-=1;
                if(last==-1)
                  return 0;
            }
            if(first<=last && nums[first]==val){
                int temp=nums[first];
                nums[first]=nums[last];
                nums[last]=temp;
                last-=1;
            }
            first+=1;
            if(last==first && nums[last]==val){
                last-=1;
                break;
            }
        }
        return last+1;
    }
}