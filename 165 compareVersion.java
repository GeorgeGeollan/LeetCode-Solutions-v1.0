class Solution {
    public int compareVersion(String version1, String version2) {
        String[] list1 = version1.split("\\.");
        String[] list2 = version2.split("\\.");

        int m = list1.length;
        int n = list2.length;

        int min = Math.min(m, n);

        for(int i = 0; i < min; i++) {
            int n1 = Integer.valueOf(list1[i]);
            int n2 = Integer.valueOf(list2[i]);

            if(n1 > n2)
                return 1;

            if(n1 < n2)
                return -1;
        }

        if(m == n)
            return 0;

        if(m > n) {
            for(int i = n; i < m; i++) {
                if(Integer.valueOf(list1[i]) != 0)
                    return 1;
            }
        }

        if(m < n) {
            for(int i = m; i < n; i++) {
                if(Integer.valueOf(list2[i]) != 0)
                    return -1;
            }
        }

        return 0;
        
    }
}
