class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] n1=new int[nums.length/2];
        int[] n2=new int[nums.length/2];
        int j=0,k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                n1[j]=nums[i];
                j++;
            }
            else{
                n2[k]=nums[i];
                k++;
            }
        }
        j=0;
        for(int i=1;i<nums.length;i+=2){
            nums[i-1]=n1[j];
            nums[i]=n2[j];
            j++;
        }
        return nums;
    }
}