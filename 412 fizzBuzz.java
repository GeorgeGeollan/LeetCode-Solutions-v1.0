class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();

        for(int i = 1; i <= n; i++)
        {
            String str = "";
            if(i % 3 == 0)
                str += "Fizz";

            if(i % 5 == 0)
                str += "Buzz";

            if(i % 3 != 0 && i % 5 != 0)
                str += i;

            res.add(str);
        }

        return res;
    }
}
