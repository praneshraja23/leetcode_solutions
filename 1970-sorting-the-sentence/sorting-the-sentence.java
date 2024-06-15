class Solution {
    public String sortSentence(String s) {
        String[] a=s.split(" ");
        StringBuilder b=new StringBuilder();
        int i=0;
        while(i<a.length){
            int n=a[i].length()-1;
            int e=a[i].charAt(n);
            if(i+49!=(int)(e)){
               String temp=a[i];
               a[i]=a[e-49];
               a[e-49]=temp;
            }
            else{
                b.append(a[i].substring(0,n)+" ");
                i++;
            }  
        }
        b.deleteCharAt(b.length()-1);
        return b.toString();
    }
}