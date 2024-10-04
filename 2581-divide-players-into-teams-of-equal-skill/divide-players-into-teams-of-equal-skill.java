class Solution {
    public long dividePlayers(int[] skill) {
        int len=skill.length;
        if(len==2)
        {
            return skill[0]*skill[1];
        }
        int sum=0;
        List<Integer> list=new ArrayList<>();
        for(int num:skill)
        {
            sum+=num;
            list.add(num);
        }

        int target=sum/(len/2);
        if(sum%(len/2)!=0)
        {
            return -1;
        }
        long che=0,count=1;
        for(int i=0;i<len;i++)
        {   
            if(skill[i]==-1)
              continue;
            int val=Math.abs(target-skill[i]);
            int s=0;
            for(int j=i+1;j<len;j++)
            {   
                if(skill[j]==val && skill[j]!=-1)
                {
                   s=1;
                   che+=(skill[i]*val);
                   skill[j]=-1;
                   skill[i]=-1;
                   
                   break;
                   }
               
            }
            if(s==0)
            {
                return -1;
            }
        }
    
       return che;
    
    }
}