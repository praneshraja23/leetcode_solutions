class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int count=0;
        int n=words.length;
        for(int i=0;i<n;i++)
        {
            if(words[(startIndex+i)%n].equals(target) || words[(startIndex-i+n)%n].equals(target))
            return count;
            count++;
        }
        return -1;
    }
}