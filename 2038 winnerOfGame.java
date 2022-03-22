class Solution {
    public boolean winnerOfGame(String colors) {
        int As = 0, Bs = 0;
        int cntA = 0, cntB = 0;

        for(int i = 0; i < colors.length();) {
            char ch = colors.charAt(i);
    
            while(i < colors.length() && ch == 'A') {
                ch = colors.charAt(i);
                if(ch == 'B')
                    break;

                cntA++;
                i++;
            }

            As += cntA > 2 ? cntA - 2 : 0;
            cntA = 0;

            if(ch != 'A')
                i++;
        }

         for(int i = 0; i < colors.length();) {
            char ch = colors.charAt(i);
    
            while(i < colors.length() && ch == 'B') {
                ch = colors.charAt(i);
                if(ch == 'A')
                    break;

                cntB++;
                i++;
            }

            Bs += cntB > 2 ? cntB - 2 : 0;
            cntB = 0;

            if(ch != 'B')
                i++;
        }

        System.out.println(As + " " + Bs);

        return As > Bs;
    }
}
