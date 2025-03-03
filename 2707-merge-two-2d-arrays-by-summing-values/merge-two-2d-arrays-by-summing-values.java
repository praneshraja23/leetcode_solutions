class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;
        int ptr1=0,ptr2=0;
        int count=0;
        while(ptr1<len1 && ptr2<len2)
        {
            if(nums1[ptr1][0]==nums2[ptr2][0])
            {
                ptr1++;
                ptr2++;
            }
            else if(nums1[ptr1][0]<nums2[ptr2][0])
            {
                ptr1++;
            }
            else 
            {
                ptr2++;
            }
            count+=1;
        }
        if(ptr1<len1)
        {
            count+=(len1-ptr1);
        }
        if(ptr2<len2)
        {
            count+=(len2-ptr2);
        }
        int[][] ans=new int[count][2];
        ptr1=0;
        ptr2=0;
        int ind=0;
        while(ptr1<len1 && ptr2<len2)
        {
            if(nums1[ptr1][0]==nums2[ptr2][0])
            {   
                ans[ind][0]=nums1[ptr1][0];
                ans[ind][1]=nums1[ptr1][1]+nums2[ptr2][1];
                ptr1++;
                ptr2++;
            }
            else if(nums1[ptr1][0]<nums2[ptr2][0])
            {
                ans[ind][0]=nums1[ptr1][0];
                ans[ind][1]=nums1[ptr1][1];
                ptr1++;
            }
            else 
            {
                ans[ind][0]=nums2[ptr2][0];
                ans[ind][1]=nums2[ptr2][1];
                ptr2++;
            }
            ind++;
        }
        while(ptr1<len1)
        {
            ans[ind][0]=nums1[ptr1][0];
            ans[ind][1]=nums1[ptr1][1];
            ptr1++;
            ind++;
        }
        while(ptr2<len2)
        {
            ans[ind][0]=nums2[ptr2][0];
            ans[ind][1]=nums2[ptr2][1];
            ptr2++;
            ind++;
        }
        return ans;
    }
}