class Solution {
    public String freqAlphabets(String s) {
        StringBuilder ans=new StringBuilder();
        int i=0;
        int len=s.length();
        while(i<len){
            if(i+2<len && s.charAt(i+2)=='#'){
              int a=Integer.parseInt(s.substring(i,i+2));
              char b=(char)(96+a);
              ans.append(b);
              i+=3;
            }else{
                char b=(char)(96+Integer.parseInt(""+s.charAt(i)));
                ans.append(b);
                i++;
            }
        }
        return ans.toString();
    }
}