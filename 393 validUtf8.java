class Solution {
    public boolean validUtf8(int[] data) {
        int n = data.length;
        Map<Integer, Integer> map = new HashMap();
        int first = 0;

        for(int i = 0; i < n; i++) {
            first = 0;
            String cur = intToString(data[i]);

            
            for(int j = 0; j < 8; j++) {
                if(cur.charAt(j) == '1')
                    first++;

                else
                    break;
            }

            if(first > 4)
                return false;

            map.put(i, first);
        }

        if(n == 1)
            return map.get(0) == 0;

        for(int i = 0; i < n; i++) {
            first = map.get(i);
            first = first - 1;

            if(first == 0)
                return false;

            while(first > 0 && i + 1 < n) {
                i++;
                int cur = map.get(i);
                if(cur != 1)
                    return false;

                first--;
            }
        }


        return true;
    }

    public String intToString(int num) {
        StringBuilder sb = new StringBuilder();

        int cnt = 0;
        while(cnt < 8) {
            sb.append(num > 0 ? num % 2 : 0);
            num = num / 2;
            cnt++;
        }
            

        return sb.reverse().toString();
    }
}
