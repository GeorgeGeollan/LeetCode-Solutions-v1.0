class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();

        for(int i = left; i <= right; i++) {
            if(isSelf(i))
                list.add(i);
        }

        return list;
    }

    public boolean isSelf(int num) {
        int temp = num;
        while(num > 0) {
            int cur = num % 10;

            if(cur == 0 || temp % cur != 0)
                return false;
                
            num = num / 10;
        }

        return true;
    }
}
