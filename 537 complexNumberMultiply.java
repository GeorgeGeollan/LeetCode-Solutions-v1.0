class Solution1 {
    public String complexNumberMultiply(String num1, String num2) {
        String[] s1 = num1.split("\\+|i");
        String[] s2 = num2.split("\\+|i");

        int real1 = Integer.parseInt(s1[0]);
        int img1 = Integer.parseInt(s1[1]);

        int real2 = Integer.parseInt(s2[0]);
        int img2 = Integer.parseInt(s2[1]);

        return (real1 * real2 - img1 * img2) + "+" + (real1 * img2 + real2 * img1) + "i";
    }
}

class Solution2 {
    public String complexNumberMultiply(String num1, String num2) {
        int real1 = Integer.valueOf(num1.substring(0, num1.indexOf("+")));
        int real2 = Integer.valueOf(num2.substring(0, num2.indexOf("+")));
        int img1 = Integer.valueOf(num1.substring(num1.indexOf("+") + 1, num1.indexOf("i")));
        int img2 = Integer.valueOf(num2.substring(num2.indexOf("+") + 1, num2.indexOf("i")));

        int a = real1 * real2 - img1 * img2;
        int b = real1 * img2 + real2 * img1;

        return "" + a + "+" + b + "i";
    }
}
