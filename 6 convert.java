class Solution {
    public String convert(String s, int numRows) {
        if(numRows < 2)
            return s;

        List<StringBuilder> row = new ArrayList<>();

        for(int i = 0; i < numRows; i++)
            row.add(new StringBuilder());

        int i = 0, flag = -1;

        for(char ch: s.toCharArray()) {
            row.get(i).append(ch);

            if(i == 0 || i == numRows - 1)
                flag = -flag;

            i += flag;
        }

        String ans = "";

        for(StringBuilder sb: row) {
            ans += sb.toString();
        }

        return ans;
    }
}
