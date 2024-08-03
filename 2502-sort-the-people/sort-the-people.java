class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int len=heights.length;
       for(int i=0;i<len;i++){
        for(int j=1;j<len-i;j++){
            if(heights[j-1]<heights[j]){
                 swap(heights,j-1,j);
                 swapstr(names,j-1,j);
            }
         } 
       } 
       return names;
    }
    public static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static void swapstr(String[] arr,int first,int second){
        String temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}