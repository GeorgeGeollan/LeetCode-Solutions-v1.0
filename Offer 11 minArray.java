class Solution {
    public int minArray(int[] numbers) {
        if(numbers.length < 2)
            return numbers[0];

        for(int i = 1; i < numbers.length; i++)
            if(numbers[i - 1] > numbers[i])
                return numbers[i];

        return numbers[0];
    }
}
