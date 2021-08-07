class Solution1 {
    public String addStrings(String num1, String num2) {
        int s1 = num1.length();
        int s2 = num2.length();
        int count = 0;
        String res = "";

        for(int i = s1 - 1, j = s2 - 1; i >= 0 && j >= 0; i--, j--)
        {
            int n1 = Integer.parseInt(Character.toString(num1.charAt(i)));
            int n2 = Integer.parseInt(Character.toString(num2.charAt(j)));
            int n3 = (n1 + n2 + count) % 10;
            count = (n1 + n2 + count) / 10;
            res = "" + n3 + res;
        }

        for(int i = Math.max(s1, s2) - Math.min(s1, s2) - 1; i >= 0; i--)
        {
            if(s1 > s2)
            {
                int n1 = Integer.parseInt(Character.toString(num1.charAt(i)));
                int n2 = (n1 + count) % 10;
                count = (n1 + count) / 10;
                res = "" + n2 + res;
            }

            if(s1 < s2)
            {
                int n1 = Integer.parseInt(Character.toString(num2.charAt(i)));
                int n2 = (n1 + count) % 10;
                count = (n1 + count) / 10;
                res = "" + n2 + res;
            }
        }

        if(count != 0)
            res = "" + count + res;

        return res;
    }
}

class Solution2 {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for(int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0 || carry == 1; i--, j--)
        {
            int n1 = i < 0 ? 0 : num1.charAt(i) - '0';
            int n2 = j < 0 ? 0 : num2.charAt(j) - '0';

            sb.append((n1 + n2 + carry) % 10);
            carry = (n1 + n2 + carry) / 10;
        }

        return sb.reverse().toString();
    }
}
