class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;

        int start = (int)(n * 0.05);
        int end = n - start;
        int sum = 0;

        System.out.println(start + " " + end + " " + n);

        for(int i = start; i < end; i++) {
            sum += arr[i];
        }

        double avg = (sum * 1.0) / (end - start);

        return avg;
    }
}
