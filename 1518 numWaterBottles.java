class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum = 0;
        sum += numBottles;
        int numEmpty = numBottles;

        while(numEmpty >= numExchange) {
            int numToExchange = numEmpty / numExchange;
            sum += numToExchange;
            numEmpty = numToExchange + numEmpty % numExchange;
        }

        return sum;
    }
}
