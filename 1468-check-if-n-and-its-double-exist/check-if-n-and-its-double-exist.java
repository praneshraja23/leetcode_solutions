class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int len=arr.length;
        if(len==2)
        {if(arr[0]==2*arr[1])
          return true;
         else
          return false;}
        boolean a=false;
        for(int i=len-1;i>=0;i--){
           if(i-1!=0) 
           a=binarysearch(arr,0,i-1,arr[i]);
           if(a)
             return a;
           if(i+1!=len-1)
           a=binarysearch(arr,i+1,len-1,arr[i]);
           if(a)
             return a;
        }
        return false;
    }
    public boolean binarysearch(int[] arr,int start,int end,int val){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(2*arr[mid]==val){
                return true;
            }
            else if(2*arr[mid]>val){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return false;
    }
}