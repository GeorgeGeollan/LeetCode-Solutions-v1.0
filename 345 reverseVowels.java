class Solution {
    public String reverseVowels(String s) {
        int l = 0;
        int r = s.length() - 1;
        char[] ans = s.toCharArray();

        while(l < r) {
            while(l < r && s.charAt(l) != 'a' && s.charAt(l) != 'e' && s.charAt(l) != 'i' && s.charAt(l) != 'o' && s.charAt(l) != 'u' && s.charAt(l) != 'A' && s.charAt(l) != 'E' && s.charAt(l) != 'I' && s.charAt(l) != 'O' && s.charAt(l) != 'U')
                l++;

            while(l < r && s.charAt(r) != 'a' && s.charAt(r) != 'e' && s.charAt(r) != 'i' && s.charAt(r) != 'o' && s.charAt(r) != 'u' && s.charAt(r) != 'A' && s.charAt(r) != 'E' && s.charAt(r) != 'I' && s.charAt(r) != 'O' && s.charAt(r) != 'U')
                r--;

            System.out.println(l + " " + r);

            char temp = ans[l];
            ans[l] = ans[r];
            ans[r] = temp;
            l++;
            r--;
        }

        return new String(ans);
    }
}
