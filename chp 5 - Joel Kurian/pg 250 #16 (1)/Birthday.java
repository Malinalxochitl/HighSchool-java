public class Birthday {
    public int findTotal(int month, int day) {
        int total = 0;
        while (month != 0) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                while (day < 1 || day > 31) {
                    total = total + 31;
                    month = month - 1;
                }
            }
            else if (month == 4 || month == 6 || month == 9 || month == 11) {
                while (day < 1 || day > 30) {
                    total = total + 30;
                    month = month - 1;
                }
            }
            else {
                while (day < 1 || day > 29) {
                    total = total + 29;
                    month = month - 1;
                }
            }
        }
        total = total + day;
        return total;
    }
}
