class Solution1 {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        int m = goal.length();

        if(m != n)
            return false;

        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < n; i++) {
            sb.append(s.charAt(i));
        }

        for(int i = 0; i < n; i++) {
            char cur = sb.toString().toCharArray()[0];
            sb.deleteCharAt(0);
            sb.insert(sb.length(), cur);

            if(sb.toString().equals(goal))
                return true;
        }

        return false;
    }
}

class Solution2 {
    public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }
}
