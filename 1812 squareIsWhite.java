
class Solution {
    public boolean squareIsWhite(String coordinates) {
        int x = coordinates.charAt(0) - 'a';
        int y = Integer.valueOf(coordinates.charAt(1));

        if((x + y) % 2 == 0)
            return true;

        return false;
    }
}
