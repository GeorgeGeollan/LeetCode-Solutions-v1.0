class Solution1 {
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

class Solution2 {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int idx = 0, max = releaseTimes[0];
        int n = releaseTimes.length;

        for(int i = 1; i < n; i++) {
            int cur = releaseTimes[i] - releaseTimes[i - 1];

            if(cur > max) {
                max = cur;
                idx = i;
            }

            else if(cur == max && keysPressed.charAt(i) > keysPressed.charAt(idx))
                idx = i;

        }

        return keysPressed.charAt(idx);
    }
}
