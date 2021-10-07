class Solution {
    public int countSegments(String s) {
        char[] letter = s.toCharArray();
        int count = 0;

        for(int i = 0; i < letter.length; i++)
        {
            if(letter[i] == ' ')
                continue;

            while(i < letter.length && letter[i] != ' ')
                i++;
            
            count++;
        }

        return count;
    }
}
