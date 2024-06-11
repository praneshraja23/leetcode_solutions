class Solution {
    public boolean halvesAreAlike(String s) {
     int a=0,b=0;
     for(int i=0;i<s.length()/2;i++){
        char s1=s.charAt(i);
        char s2=s.charAt(i+s.length()/2);
        if(s1=='a'||s1=='e'||s1=='i'||s1=='o'||s1=='u'||
           s1=='A'||s1=='E'||s1=='I'||s1=='O'||s1=='U'){
           a++;   
           }
        if(s2=='a'||s2=='e'||s2=='i'||s2=='o'||s2=='u'||
           s2=='A'||s2=='E'||s2=='I'||s2=='O'||s2=='U'){
           b++;   
           }

     }  
     return a==b ; 
    }
}