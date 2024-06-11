class Solution {
    public boolean halvesAreAlike(String s) {
     int a=0,b=0;
     for(int i=0;i<s.length()/2;i++){
        if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||
           s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
           a++;   
           }
        if(s.charAt(i+s.length()/2)=='a'||s.charAt(i+s.length()/2)=='e'||s.charAt(i+s.length()/2)=='i'||s.charAt(i+s.length()/2)=='o'||s.charAt(i+s.length()/2)=='u'||
           s.charAt(i+s.length()/2)=='A'||s.charAt(i+s.length()/2)=='E'||s.charAt(i+s.length()/2)=='I'||s.charAt(i+s.length()/2)=='O'||s.charAt(i+s.length()/2)=='U'){
           b++;   
           }

     }  
     return a==b ; 
    }
}