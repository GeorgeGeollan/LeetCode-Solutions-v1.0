class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;

        while(n >= 1) {
            sum += n % 10;
            product *= n % 10;
            n = n / 10;
        }

        System.out.print(product + " " + sum);

        return product - sum;
    }
}
