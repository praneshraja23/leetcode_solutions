class Solution {
    public String convertToTitle(int columnNumber) {
     if(columnNumber<=26){
        return String.valueOf((char)(64+columnNumber));
     }
     ArrayList<Character> a=new ArrayList<>();
     while(columnNumber>26){
        int r=columnNumber%26;
        if(r==0){
            a.add('Z');
            columnNumber/=26;
            columnNumber--;
        }
        else{
             a.add((char)(64+r));
             columnNumber/=26;
        }
       
     }   
     a.add((char)(64+columnNumber));
     StringBuilder b=new StringBuilder();
     for(int i=a.size()-1;i>=0;i--){
        b.append(a.get(i));
     }
     return b.toString();
    }
}