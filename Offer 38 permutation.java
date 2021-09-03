class Solution {
    char[] c;
    List<String> res = new ArrayList<>();

    public String[] permutation(String s) {
        c = s.toCharArray();

        helper(0);

        return res.toArray(new String[res.size()]);
    }

    public void helper(int x)
    {
        if(x == c.length - 1)
        {
            res.add(String.valueOf(c));
            return;
        }

        HashSet<Character> set = new HashSet<>();
        for(int i = x; i < c.length; i++)
        {
            if(set.contains(c[i]))
                continue;

            set.add(c[i]);
            swap(i, x);
            helper(x + 1);
            swap(i, x);
        }
    }

    public void swap(int a, int b)
    {
        char temp = c[a];
        c[a] = c[b];
        c[b] = temp;
    }
}
