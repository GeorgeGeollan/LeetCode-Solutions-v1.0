class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();

        int[] pos = new int[n];

        for(int i = 0; i < n; i++)
            pos[i] = i;

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c)
                list.add(i);
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < list.size(); j++) {
                if(j == 0)
                    pos[i] = Math.abs(i - list.get(j));
                else    
                    pos[i] = Math.min(pos[i], Math.abs(i - list.get(j)));
            }
        }

        return pos;
    }
}
