class Solution {
    public int dayOfYear(String date) {
        int dayOfFeb = 28;

        String[] info = date.split("-");
        int year = Integer.parseInt(info[0]);
        int month = Integer.parseInt(info[1]);
        int day = Integer.parseInt(info[2]);
        int total = 0;
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            dayOfFeb = 29;

        int[] dayOfMonth = {31, dayOfFeb, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for(int i = 0; i < month - 1; i++) {
            total += dayOfMonth[i];
        }

        total += day;

        return total;
    }
}
