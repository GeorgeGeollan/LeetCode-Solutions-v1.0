class Solution {
    public String crackPassword(int[] password) {
        int n = password.length;
        String[] strs = new String[n];

        for(int i = 0; i < n; i++) {
            strs[i] = String.valueOf(password[i]);
        }

        Arrays.sort(strs, (x, y) -> (x + y ).compareTo(y + x));

        StringBuilder sb = new StringBuilder();

        for(String str: strs) {
            sb.append(str);
        }

        return sb.toString();
    }
}
