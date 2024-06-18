class Solution {
    public String reverseWords(String s) {
        String[] a=s.split(" ");
        StringBuilder c=new StringBuilder();
        for(int i=0;i<a.length;i++){
            int len=a[i].length();
            char[] b=a[i].toCharArray();
            for(int j=0;j<(len+1)/2;j++){
                char temp=b[j];
                b[j]=b[len-1-j];
                b[len-1-j]=temp;
            }
            c.append(new String(b)+" ");
        }
        c.deleteCharAt(s.length());
        return c.toString();
    }
}