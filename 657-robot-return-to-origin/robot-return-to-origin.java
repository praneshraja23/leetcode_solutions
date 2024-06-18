class Solution {
    public boolean judgeCircle(String moves) {
        int c=0,d=0;
        for(int i=0;i<moves.length();i++){
            switch(moves.charAt(i)){
                case 'U'->c++;
                case 'D'->c--;
                case 'R'->d++;
                case 'L'->d--;
            }
        }
        return (c==0 && d==0);
    }
}