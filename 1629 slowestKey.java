class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int lasttime = 0;
        int max = 0;
        char maxChar = 'a';
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < releaseTimes.length; i++)
        {
            int currtime = releaseTimes[i];
            int dist = currtime - lasttime;

            if(max < dist)
            {
                max = dist;
                maxChar = keysPressed.charAt(i);
            }

            else if(max == dist)
            {
                if(maxChar < keysPressed.charAt(i))
                    maxChar = keysPressed.charAt(i);
            }

            lasttime = releaseTimes[i];
        }

        return maxChar;
    }
}
