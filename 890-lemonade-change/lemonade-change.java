class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0,ten=0,twenty=0;
        int len=bills.length;
        for(int i=0;i<len;i++){
            switch(bills[i]){
                case 5:
                {   five+=1;
                    break;}
                case 10:
                {
                    ten+=1;
                    five-=1;           
                    break;}
                case 20:
                   {
                    twenty+=1;
                    if(ten>0){
                      ten-=1;
                      five-=1;
                    }
                    else{
                    five-=3;
                    }
                    break;}
            }
             if(five<0)
                return false;
        }
       return true;
    }
}