class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        int start = 1971;
        int num = year - start;

        int[] dayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayOfWeek = {"Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};

        int totalDay = 0;

        for(int i = 0; i < num; i++) {
            if((start % 4 == 0 && start % 100 != 0) || start % 400 == 0)
                totalDay += 366;

            else
                totalDay += 365;

            start++;
        }

        
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            dayOfMonth[1] = 29;


        for(int i = 0; i < month - 1; i++) {
            System.out.println(i);
            totalDay += dayOfMonth[i];
        }
            

        totalDay += day;
        return dayOfWeek[totalDay % 7];
    }
}
