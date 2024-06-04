class Solution {
    public int longestPalindrome(String s) {
       HashSet<Character> charset=new HashSet<>();
       int count=0;
       for(char a:s.toCharArray()){
        if(charset.contains(a)){
            charset.remove(a);
            count+=2;
        }
        else{
            charset.add(a);
        }
       }
       if(!charset.isEmpty()){
          count+=1;
       }
      return count;
    }
   
}