class Solution {
    public String reverseWords(String s) {
        String[] a=s.split(" ");
        StringBuilder c=new StringBuilder();
        for(int i=0;i<a.length;i++){
            int len=a[i].length();
            char[] b=a[i].toCharArray();
            for(int j=len-1;j>=0;j--){
                c.append(b[j]);
            }
            c.append(" ");
        }
        c.deleteCharAt(s.length());
        return c.toString();
    }
}