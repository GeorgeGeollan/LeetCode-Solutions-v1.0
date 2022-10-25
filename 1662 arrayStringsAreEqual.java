class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = "";
        String str2 = "";
        
        for(String w: word1)
            str1 += w;
        
        for(String w: word2)
            str2 += w;
        
        return str1.equals(str2);
    }
}
