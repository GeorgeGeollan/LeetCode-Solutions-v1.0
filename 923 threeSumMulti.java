class Solution {
    public int threeSumMulti(int[] arr, int target) {
        int mod = 1_000_000_007;
        long ans = 0;
        Arrays.sort(arr);
        int n = arr.length;
        
        for(int i = 0; i < n; i++) {
            int T = target - arr[i];
            int j = i + 1, k = n - 1;
            
            
            while(j < k) {
                if(arr[j] + arr[k] > T)
                    k--;
                
                else if(arr[j] + arr[k] < T)
                    j++;
                
                else if(arr[j] != arr[k]) {
                    int left = 1, right = 1;
                    
                    while(j + 1 < k && arr[j] == arr[j + 1]) {
                        left++;
                        j++;
                    }
                    
                    while(k - 1 > j && arr[k - 1] == arr[k]) {
                        right++;
                        k--;
                    }
                    
                    ans += left * right;
                    ans %= mod;
                    j++;
                    k--;
                }
                
                else {
                    ans += (k - j + 1) * (k - j) / 2;
                    ans %= mod;
                    break;
                }
            }
        }
        
        return (int) ans;
    }
}
