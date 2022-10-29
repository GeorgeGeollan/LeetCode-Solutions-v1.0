class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int type = 0;
        if(ruleKey.equals("color"))
            type = 1;

        if(ruleKey.equals("name"))
            type = 2;

        int cnt = 0;

        for(List<String> item: items) {
            if(item.get(type).equals(ruleValue))
                cnt++;
        }

        return cnt;
    }
}
