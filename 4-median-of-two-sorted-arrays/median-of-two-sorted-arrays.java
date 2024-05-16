class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int j=0,k=0;
        int len1=nums1.length;
        int len2=nums2.length;
        if(len1==0 && len2==0)
         return (double)0;
        if(len1==1 && len2==1){
            return ((double)nums1[0]+(double)nums2[0])/2;        }
        int[] arr=new int[len1+len2];
        for(int i=0;i<len1+len2;)
        {  if(j<len1 && k<len2){
             if(nums1[j]<nums2[k])
             { arr[i]=nums1[j];
              j++;
              i++;}
            else if(nums1[j]>nums2[k]){
              arr[i]=nums2[k];
              k++; 
              i++; 
            }
            else{
                arr[i]=nums1[j];
                j++;
                arr[i+1]=nums2[k];
                k++;
                i+=2;
            }
            }
            else{
                if(j<len1){
                    arr[i]=nums1[j];
                    j++;
                    i++;
                }
                else {
                    arr[i]=nums2[k];
                    k++; 
                    i++; 
                }
                
            }
        }
        // System.out.println(Arrays.toString(arr));
       int mid=(len1+len2)/2;
       if((len1+len2)%2==0)
         return (((double)arr[mid-1]+(double)arr[mid])/2);
       else
        return (double)arr[mid];
    }
}