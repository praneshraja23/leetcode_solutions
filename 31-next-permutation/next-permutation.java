class Solution {
    public void nextPermutation(int[] nums) {
        int len=nums.length,c=0;
        int ind=-1;
        for(int i=len-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            rev(nums,0,len-1);
            return;
        }
       for(int i=len-1;i>=0;i--){
            if(nums[ind]<nums[i]){
                swap(nums,ind,i);
                break;
            }
        }
        rev(nums,ind+1,len-1);   
                
    }
    public static void rev(int[] nums,int start,int end){
        while(start<end){
            swap(nums,start,end);
            start+=1;
            end-=1;
        }
    }
    public static void swap(int[] nums,int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}