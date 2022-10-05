class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> ans = new ArrayList<>();

        Map<String, Integer> map = new HashMap<>();

        for(String cpdomain: cpdomains) {
            String[] arr = cpdomain.split(" ");
            String names = arr[1];
            int time = Integer.parseInt(arr[0]);

            String[] domains = names.split("\\.");
            String dname = "";
            for(int i = domains.length - 1; i >= 0; i--) {
                if(i == domains.length - 1)
                    dname = domains[domains.length - 1];
                else
                    dname = domains[i] + "." + dname;
                int prev = map.getOrDefault(dname, 0);
                int cur = time + prev;

                map.put(dname, cur);
            }
        }

        for(String name: map.keySet()) {
            int value = map.get(name);

            String cur = value + " " + name;
            System.out.println(cur);
            ans.add(cur);
        }

        return ans;
    }
}
