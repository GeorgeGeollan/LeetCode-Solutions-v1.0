class Solution {
    public int maximumSwap(int num) {
        if(num % 10 == num)
            return num;

        char[] arr = String.valueOf(num).toCharArray();

        for(int i = 0; i < arr.length; i++) {
            int maxIndex = i;

            for(int j = arr.length - 1; j >= i + 1; j--) {
                if(arr[j] > arr[maxIndex])
                    maxIndex = j;
            }

            if(maxIndex != i) {
                char temp = arr[i];
                arr[i] = arr[maxIndex];
                arr[maxIndex] = temp;
                return Integer.parseInt(new String(arr));
            }
        }

        return num;
    }
}
