class Solution {
    public int maxProduct(String[] words) {
        int[] value = new int[words.length];

        for(int i = 0; i < value.length; i++)
        {
            String word = words[i];

            for(int j = 0; j < word.length(); j++)
            {
                value[i] |= 1 << (word.charAt(j)- 'a');
            }
        }

        int max = 0;
        for(int i = 0; i < words.length; i++)
        {
            for(int j = i + 1; j < words.length; j++)
            {
                if((value[i] & value[j]) == 0)
                    max = Math.max(max, words[i].length() * words[j].length());
            }
        }

        return max;
    }
}
