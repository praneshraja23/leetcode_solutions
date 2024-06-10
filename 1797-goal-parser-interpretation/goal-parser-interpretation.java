class Solution {
    public String interpret(String command) {
      String a="";
      int i=0;
      while(i<command.length()){
        if(command.charAt(i)=='G'){
            a+="G";
        }
        else if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
            a+="o";
            i+=1;
        }
        else{
            a+="al";
            i+=3;
        }
          i++; 
      }
      return a;  
    }
}