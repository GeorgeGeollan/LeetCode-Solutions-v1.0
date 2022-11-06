class Solution {
    public String interpret(String command) {
       StringBuilder sb = new StringBuilder();

       for(int i = 0; i < command.length(); i++) {
           if(command.charAt(i) == 'G') {
               sb.append("G");
           }

           if(command.charAt(i) == '(') {
               i++;
               if(command.charAt(i) == ')') {
                   sb.append("o");
               }

               else {
                   sb.append("al");
               }
           }
       }

       return sb.toString();
    }
}
