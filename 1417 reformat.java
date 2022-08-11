class Solution {
    public String reformat(String s) {
        int n = s.length();
        char[] arr = new char[2 * n + 1];
        int i = 1;
        int j = 2;

        for(char c: s.toCharArray()) {
            if(Character.isDigit(c)) {
                arr[i] = c;
                i += 2;
            }

            else {
                arr[j] = c;
                j += 2;
            }
        }

        if(i + 3 == j) {
            arr[0] = arr[j - 2];
            return new String(arr, 0, i);
        }
            

        else if(i + 1 == j)
            return new String(arr, 1, i - 1);

        else if(j + 1 == i)
            return new String(arr, 1, j - 1);

        else
            return "";
    }
}
