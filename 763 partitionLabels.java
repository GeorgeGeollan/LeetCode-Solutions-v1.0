class Solution {
    public List<Integer> partitionLabels(String s) {
        if(s == null || s.length() == 0)
            return new ArrayList<Integer>();

        int[] arr = new int[26];
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < s.length(); i++)
            arr[s.charAt(i) - 'a'] = i; 

        
        int start = 0;
        int last = 0;

        for(int i = 0; i < s.length(); i++)
        {
            last = Math.max(last, arr[s.charAt(i) - 'a']);

            if(last == i)
            {
                list.add(last + 1 - start);
                start = last + 1;
            }
        }

        return list;
    }
}
