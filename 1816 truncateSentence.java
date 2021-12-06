class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();

        // 将空格之间的单词分隔开，存到一个String的数组中
        String[] list = s.split(" ");

        for(int i = 0; i < k; i++) {
            // 将k之前的单词添加到先前定义好的StringBuilder中，并紧接着添加一个空格
            sb.append(list[i]);
            sb.append(" ");
        }
            

        // 使用trim()可以将首位的单词去掉
        return sb.toString().trim();
    }
}
