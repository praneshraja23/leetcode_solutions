class Solution {
    public String interpret(String command) {
      String a="";
      for(int i=0;i<command.length();i++){
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
           
      }
      return a;  
    }
}