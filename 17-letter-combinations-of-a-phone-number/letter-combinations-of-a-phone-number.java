class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            List<String> a=new ArrayList<>();
            return a;
        }
          
        return padRet("",digits);
    }
    public List<String> padRet(String p,String up){
        if(up.isEmpty()){
            List<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit= up.charAt(0)-'0'; //to convert the char to int('2' to 2).
        int start;
        int end;
        switch(digit){
            default:
            {start=(digit-2)*3;
                end=(digit-1)*3;
                break;}
            case 7:
            {start=(digit-2)*3;
             end=(digit-1)*3+1;
             break;}
            case 8:{start=(digit-2)*3+1;
                end=(digit-1)*3+1;
                break;}
            case 9:
            {start=(digit-2)*3+1;
             end=(digit-1)*3+2;
             break;}
        }
        List<String> list=new ArrayList<>();
        for(int i=start;i<end;i++){
            char ch=(char)('a'+i);
            list.addAll(padRet(p+ch,up.substring(1)));
        }
        return list;
    }
    
}