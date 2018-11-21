public class Birthday {
    public int findTotal(int month, int day) { //gets month and day from user
        int total = 0; //instance variables
        while (month != 0) { //wile there are still months to count
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){ //the months has 31 days
                total = total + 31; //adds days
                month = month - 1; //removes a month
            }
            else if (month == 4 || month == 6 || month == 9 || month == 11) { //months that have 30 days
                total = total + 30; //adds days
                month = month - 1; //removes month 
            }
            else { //month that has 29 days
                total = total + 29; //adds days
                month = month - 1; //removes month
            }
        }
        total = total + day; //adds remaining days
        return total; //returns the total
    }
}
