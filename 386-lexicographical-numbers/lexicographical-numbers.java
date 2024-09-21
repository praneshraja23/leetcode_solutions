class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list =new ArrayList<>();
        return find_lexicalOrder(1,n,list);
    }
   
    public List<Integer> find_lexicalOrder(int val,int n,List<Integer> list)
     {  
        if(val==n)
        {
            list.add(val);
            
            return list;
        }
        list.add(val);
        
        if(val*10<=n)
        {
            list=find_lexicalOrder(val*10,n,list);
        }
        if(val%10!=9)
        {
         list=find_lexicalOrder(val+1,n,list);
        }
        return list;
    }
}