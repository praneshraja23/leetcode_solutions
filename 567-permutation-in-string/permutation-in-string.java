class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] ch=s1.toCharArray();
        Arrays.sort(ch);
        s1=String.valueOf(ch);
         System.out.print(s1);
        int len=ch.length;
        for(int i=0;i<s2.length()-len+1;i++)
        {
            char[] temp=s2.substring(i,len+i).toCharArray();
            Arrays.sort(temp);
           
            if(s1.equals(String.valueOf(temp)))
            {
                return true;
            }
        }
        return false;
    }
}