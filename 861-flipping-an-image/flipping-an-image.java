class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int temp;
        int len1=image.length;
        
        for(int i=0;i<len1;i++)
        {int len2=image[i].length;
        for(int j=0;j<(len2+1)/2;j++)
           {temp=image[i][j]^1;
            image[i][j]=image[i][len2-j-1]^1;
            image[i][len2-j-1]=temp;  
           }
         
        }
        return image;
    }
}