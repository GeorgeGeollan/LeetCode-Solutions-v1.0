class Solution {
    public String convertToBase7(int num) {
        if(num == 0)
            return "0";
        
        StringBuilder sb = new StringBuilder();
        boolean isPostive = true;
        if(num < 0) {
            isPostive = false;
            num = -num;
        }


        while(num != 0) {
            sb.append(num % 7);
            num /= 7;
        }

        if(!isPostive)
            sb.append("-");

        return sb.reverse().toString();

    }
}
