class Solution {
    public String compressedString(String word) {
        StringBuilder comp=new StringBuilder();
        char pre=word.charAt(0);
        int count=0;
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(pre!=ch || count==9)
            {   
                comp.append(""+count+""+pre);
                pre=ch;
                count=0;
            }
            count++;
        }
        comp.append(""+count+""+pre);
        
        return comp.toString();
    }
}