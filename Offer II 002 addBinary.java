
## My Clumsy Solution
class Solution1 {
    public String addBinary(String a, String b) {
        char[] al = a.toCharArray();
        char[] bl = b.toCharArray();

        int n1 = al.length - 1, n2 = bl.length - 1;
        int impr = 0;
        String res = "";
        int i, j;
        StringBuilder sb = new StringBuilder();        
        for(i = n1, j = n2; i >= 0 && j >= 0; i--, j--)
        {
            int num = al[i] - '0' + bl[j] - '0' + impr;
            System.out.println(num);
            impr = num / 2;

            if(num >= 2)
                num %= 2;

            sb.append(num);
               
        }

        while(i >= 0)
        {
            int num = al[i] - '0' + impr;
            impr = num / 2;

            if(num >= 2)
                num %= 2;

            sb.append(num);
            i--;
        }

        while(j >= 0)
        {
            int num = bl[j] - '0' + impr;
            impr = num / 2;

            if(num >= 2)
                num %= 2;
            sb.append(num);
            j--;
        }

        if(impr != 0)
            sb.append(impr);

        return sb.reverse().toString();
    }
}

class Solution2 {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int n1 = a.length() - 1, n2 = b.length() - 1, carry = 0;

        while(n1 >= 0 || n2 >= 0)
        {
            int sum = carry;
            if(n1 >= 0)
                sum += a.charAt(n1--) - '0';
            if(n2 >= 0)
                sum += b.charAt(n2--) - '0';
            
            sb.append(sum % 2);
            carry = sum / 2;
        }

        if(carry != 0)
            sb.append(carry);

        return sb.reverse().toString();
    }
}
