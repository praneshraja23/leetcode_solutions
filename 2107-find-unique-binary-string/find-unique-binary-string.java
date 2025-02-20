class Solution {
    public String findDifferentBinaryString(String[] nums) {
      int len=nums.length;
      List<String> list=new ArrayList<>();
      for(String str:nums)
      {
        list.add(str);
      }
      return find(0,"",len,list);   
    }

    public String find(int i,String st,int len,List<String> list)
    {
        if(i==len)
        {
            if(!list.contains(st))
            {
                return st;
            }
            return "";
        }

        for(int j=0;j<2;j++)
        {
            char c=(char)('0'+j);
            st+=c;
            String s=find(i+1,st,len,list);
            if(s!="")
            {
                return s;
            }
            st=st.substring(0,st.length()-1);
        }
        return "";
    }
}