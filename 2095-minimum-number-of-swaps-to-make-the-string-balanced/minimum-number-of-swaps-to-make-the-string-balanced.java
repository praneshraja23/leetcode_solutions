class Solution {
    public int minSwaps(String s) {
        Stack<Character> stack=new Stack<>();
        int count=0;
        for(char ch:s.toCharArray())
        {   
            if(ch=='[')
            {
                stack.push(ch);
            }
            else if(!stack.isEmpty())
            {
                stack.pop();
            }
            else
            {
                count++;
            }
        }
        return (count+1)/2;
    }
}