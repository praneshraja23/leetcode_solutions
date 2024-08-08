class Solution {
    public int hIndex(int[] citations) {
        int len=citations.length;
        int count=0;
        sort(citations,0,len-1);
        for(int i=0;i<len;i++){
            if(citations[i]>=i+1){
                count+=1;
            }
        }
        return count;
    }
    public void sort(int[] arr,int start,int end){
        if(start>=end){
            return;
        }
        int low=start;
        int high=end;
        int mid=start+(end-start)/2;
        int pivot=arr[mid];
        while(start<=end){
            while(pivot<arr[start]){
                start++;
            }
            while(pivot>arr[end]){
                end--;
            }
            if( start<=end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        sort(arr,low,end);
        sort(arr,start,high);
    }
}