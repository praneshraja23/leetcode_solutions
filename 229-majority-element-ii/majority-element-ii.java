class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int len=nums.length;
        List<Integer> list=new ArrayList<>();
        int count1=0,count2=0;
        int ele1=0,ele2=0;
        for(int i=0;i<len;i++){
            if(count1==0 && ele2!=nums[i]){
                ele1=nums[i];
                count1=1;
            }
            else if(count2==0 && ele1!=nums[i]){
                ele2=nums[i];
                count2=1;
            }
            else if(ele1==nums[i]){
                count1++;
            }
            else if(ele2==nums[i]){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int i=0;i<len;i++){
            if(ele1==nums[i]){
                count1++;
            }
             if(ele2==nums[i]){
                count2++;
            }
        }
        int min=((int)(len/3));
        if(count1>min){
            list.add(ele1);
        }
        if(count2>min && ele1!=ele2){
            list.add(ele2);
        }
        
        return list;
    }
}