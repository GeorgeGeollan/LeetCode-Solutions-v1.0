class Solution1 {
    public int[] plusOne(int[] digits) {
        int impr = 1, num = 0;
        List<Integer> list = new ArrayList<>();

        for(int i = digits.length - 1; i >= 0; i--) {
            num = (digits[i] + impr) % 10;
            list.add(num);
            impr = (digits[i] + impr) / 10;
        }

        if(impr == 1)
            list.add(1);

        int[] res = new int[list.size()];

        for(int i = 0; i < list.size(); i++)
            res[i] = list.get(list.size() - i - 1);

        return res;
    }
}

class Solution2 {
    public int[] plusOne(int[] digits) {
        int impr = 1;
        int n = digits.length;

        for(int i = n - 1; i >= 0; i--) {
            int cur = (digits[i] + impr) % 10;
            impr = (digits[i] + impr) / 10;

            digits[i] = cur;

            if(impr == 0)
                break;
        }

        if(impr == 1) {
            digits = new int[n + 1];
            digits[0] = 1;
        }

        return digits;
    }
}
