class Solution {
    public String freqAlphabets(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
            if(i+2<s.length() && s.charAt(i+2)=='#'){
              int a=Integer.parseInt(s.charAt(i)+""+s.charAt(i+1));
              char b=(char)(96+a);
              ans+=b;
              i+=2;
            }else{
                char b=(char)(96+Integer.parseInt(""+s.charAt(i)));
                ans+=b;
            }
        }
        return ans;
    }
}