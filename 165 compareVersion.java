class Solution1 {
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

class Solution2 {
    public int compareVersion(String version1, String version2) {
        int i = 0, j = 0;
        int m = version1.length(), n = version2.length();
        
        while(i < m || j < n) {
            int num1 = 0, num2 = 0;
            
            while(i < m && version1.charAt(i) != '.')
                num1 = num1 * 10 + version1.charAt(i++) - '0';
            
            while(j < n && version2.charAt(j) != '.')
                num2 = num2 * 10 + version2.charAt(j++) - '0';
            
            if(num1 < num2)
                return -1;
            
            if(num1 > num2)
                return 1;
            
            i++;
            j++;
        }
        
        return 0;
    }
}
