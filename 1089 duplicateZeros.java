class Solution {
    public void duplicateZeros(int[] arr) {
        StringBuilder sb = new StringBuilder();

        for(int a: arr) {
            sb.append(a);
        }

        String s = sb.toString();
        s = s.replaceAll("0", "00");

        for(int i = 0; i < arr.length; i++) {
            arr[i] = s.charAt(i) - '0';
        }
    }
}
