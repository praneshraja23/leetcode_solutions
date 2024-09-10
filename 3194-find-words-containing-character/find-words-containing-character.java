class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list=new ArrayList<>();
        int len=words.length;
        for(int i=0;i<len;i++)
        {   char[] ch=words[i].toCharArray();
            for(int j=0;j<ch.length;j++)
            {
                if(ch[j]==x)
                {
                    list.add(i);
                    break;
                }
            }
        }
        return list; 
    }
}