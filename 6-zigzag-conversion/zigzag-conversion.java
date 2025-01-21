class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1)
        {
            return s;
        }
        List<StringBuilder> list=new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            list.add(new StringBuilder());
        }
        int len=s.length();
        int ind=0;
        boolean check=true;
        for(int i=0;i<len;i++)
        {
            list.get(ind).append(s.charAt(i));
            if(ind==0)
            {
                check=true;
            }
            else if(ind==numRows-1)
            {
                check=false;
            }
            if(check)
            {
                ind++;
            }
            else
            {
                ind--;
            }
        }
        StringBuilder str=new StringBuilder();
        for(int i=0;i<numRows;i++)
        {
            str.append(list.get(i));
        }
        return str.toString();
    }
}