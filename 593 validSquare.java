class Solution {
    long len = -1;
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        return calc(p1, p2, p3) && calc(p1, p3, p4) && calc(p1, p2,p4) && calc(p2, p3, p4);
    }

    boolean calc(int[] a, int[] b, int[] c) {
        long l1 = (a[0] - b[0]) * (a[0] - b[0]) + (a[1] - b[1]) * (a[1] - b[1]);
        long l2 = (a[0] - c[0]) * (a[0] - c[0]) + (a[1] - c[1]) * (a[1] - c[1]);
        long l3 = (b[0] - c[0]) * (b[0] - c[0]) + (b[1] - c[1]) * (b[1] - c[1]);

        boolean ok = (l1 == l2 && l1 + l2 == l3) || (l1 == l3 && l1 + l3 == l2) || (l2 == l3 && l2 + l3 == l1);
        if (!ok) return false;
        if (len == -1) len = Math.min(l1, l2);
        else if (len == 0 || len != Math.min(l1, l2)) return false;
        return true;
    }
}
