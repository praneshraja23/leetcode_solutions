class Solution {
    public int majorityElement(int[] nums) {
       sort(nums,0,nums.length-1);
       int c=1,max=0,val=nums[0],ans=nums[0];
       System.out.print(Arrays.toString(nums));
       for(int i=1;i<nums.length;i++){
        if(nums[i-1]==nums[i]){
            c+=1;
        }
        else{
            if(max<c){
                max=c;
                ans=val;
            }
            c=1;
            val=nums[i];
        }
       }
       if(max<c){
                max=c;
                ans=val;
            }
       return ans;
    }
    public static void sort(int[] nums,int low,int hi){
        if(low>=hi){
            return;
        }
        int s=low;
        int e=hi;
        int m=s+(e-s)/2;
        int pivot=nums[m];
        while(s<=e){
            while(nums[s]<pivot){
                s++;
            }
            while(nums[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp=nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
                s++;
                e--;
            }
        }
        sort(nums,low,e);
        sort(nums,s,hi);
    }
}