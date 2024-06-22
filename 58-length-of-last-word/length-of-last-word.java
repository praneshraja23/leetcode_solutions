class Solution {
    public int lengthOfLastWord(String s) {
        String[] split=s.split(" ");
        int len=split.length-1;
        return split[len].length();
    }
}