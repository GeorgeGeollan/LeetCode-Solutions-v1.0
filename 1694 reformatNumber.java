class Solution {
    public String reformatNumber(String number) {
        ArrayList<Character> cnt = new ArrayList<>();

        for(char ch: number.toCharArray()) {
            if(ch == ' ' || ch == '-')
                continue;

            cnt.add(ch);
        }

        int len = cnt.size();
        int ori = cnt.size();
        int mod = len % 3;

        if(mod == 2)
            len = len - mod;

        else if(mod == 1) {
            len = len - 4;
            mod = 4;
        }
        String ans = "";
        System.out.println(mod);
        for(int i = 0; i < len; i++) {
            ans += cnt.get(i);
            if((i + 1) % 3 == 0)
                ans += "-";
        }

        if(mod == 0)
            ans = ans.substring(0, ans.length() - 1);

        if(mod == 2) {
            ans += cnt.get(ori - 2);
            ans += cnt.get(ori - 1);
        }

        if(mod == 4) {
            ans += cnt.get(ori - 4);
            ans += cnt.get(ori - 3);
            ans += "-";
            ans += cnt.get(ori - 2);
            ans += cnt.get(ori - 1);
        }

        return ans;
    }
}
