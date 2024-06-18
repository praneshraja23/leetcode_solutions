class Solution {
    public boolean judgeCircle(String moves) {
        int c=0,d=0;
        for(char e:moves.toCharArray()){
            switch(e){
                case 'U'->c++;
                case 'D'->c--;
                case 'R'->d++;
                case 'L'->d--;
            }
        }
        return (c==0 && d==0);
    }
}