class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
       String a1="",a2="";
       for(int i=0;i<word1.length;i++){
        a1+=word1[i];
       }
       for(int i=0;i<word2.length;i++){
        a2+=word2[i];
       } 
       return a1.equals(a2);
    }
}