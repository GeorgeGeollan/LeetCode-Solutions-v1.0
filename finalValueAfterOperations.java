class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        
        for(String operation: operations) {
            if((operation.charAt(0) == '+') ||(operation.charAt(0) == 'X' && operation.charAt(1) == '+')) {
                ans++;
            }

            else {
                ans--;
            }
        }
        
        return ans;
    }
}