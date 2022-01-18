class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i = 0, len = flowerbed.length; i < len && n > 0; ) {
            if(flowerbed[i] == 1)
                i = i + 2;
            
            else if(i == flowerbed.length - 1 || flowerbed[i + 1] == 0) {
                n--;
                i = i + 1;
            }
            
            else
                i = i + 3;
        }
        
        return n <= 0;
    }
}
