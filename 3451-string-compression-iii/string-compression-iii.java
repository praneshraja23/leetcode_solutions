class Solution {
    public String compressedString(String word) {
        StringBuilder comp=new StringBuilder();
        char pre=word.charAt(0);
        int count=0,len=word.length();
        for(int i=0;i<len;)
        {
            char ch=word.charAt(i);
            while(pre==ch && count<9)
            {   
                count++;
                i++;
                if(i<len)
                ch=word.charAt(i);
                else
                break;
            }
            comp.append(""+count+""+pre);
            pre=ch;
            count=0;
            
        }
        
        
        return comp.toString();
    }
}