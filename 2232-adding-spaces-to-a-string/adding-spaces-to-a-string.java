class Solution {
    public String addSpaces(String s, int[] spaces) {
        int st=0,i=0;
        StringBuilder str=new StringBuilder();
        while(i<spaces.length){
            int e=spaces[i];
            str.append(s.substring(st,e));
            str.append(" ");
            st=e;
            i++;
        }
        str.append(s.substring(st,s.length()));
        return str.toString();
    }
}