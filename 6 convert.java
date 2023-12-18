class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;

        StringBuilder[] sbArray = new StringBuilder[numRows];
        for(int i = 0; i < numRows; i++) {
            sbArray[i] = new StringBuilder();
        }

        boolean reverse = false;
        int ptr = 0;
        String ans = "";

        for(int i = 0; i < s.length(); i++) {
            if(ptr == numRows - 1) reverse = true;
            if(ptr == 0) reverse = false;
            sbArray[ptr].append(s.charAt(i));

            ptr = reverse ? ptr - 1 : ptr + 1;
        }

        for(StringBuilder sb: sbArray) {
            ans += sb.toString();
        }

        return ans;
    }
}
