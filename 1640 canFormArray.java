class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        int ans = 0;
        for(int[] piece: pieces) {
            int cnt = 0;
            for(int i = 0; cnt < piece.length && i < arr.length; i++) {
                if(piece[cnt] != arr[i])
                    continue;

                while(cnt < piece.length && i < arr.length && piece[cnt] == arr[i]) {
                    cnt++;
                    i++;
                    ans++;
                }

                if(cnt != piece.length)
                    return false;

            }
        }


        return ans == arr.length;
    }
}
