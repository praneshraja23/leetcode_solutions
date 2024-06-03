class Solution {
    public int appendCharacters(String s, String t) {
       int len=t.length();
       int j=0;
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)==t.charAt(j)){
              if(j+1!=len){
                j++;
              }
              else
                return 0;
        }

       }
       return len-j+1-1;
    }
}