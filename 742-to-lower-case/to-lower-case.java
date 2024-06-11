class Solution {
    public String toLowerCase(String s) {
        StringBuilder a=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90){
              char ch=(char)(s.charAt(i)+32);
              a.append(ch);
            }
              
            else{
              a.append(s.charAt(i));
             
            }
        }
        return a.toString();
    }
}