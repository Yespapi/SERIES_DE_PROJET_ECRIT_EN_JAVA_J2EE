/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package objectsclasses;

/**
 *
 * @author simon
 */
public class Date {
    private int day;
    private int month;
    private int year;
    
    @Override
    public String toString() {
        return this.month + "/" + this.day + "/" + this.year;
    }
    
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public static boolean isLeapYear(int year) {
        return (((year % 4) == 0) && ((year % 100) != 0)) || ((year % 400) == 0);
    }

    public static int daysInMonth(int month, int year) {
        int rv;
        switch(month) {
            case 9: // Thirty days hath September
            case 4: // April...
            case 6: // June...
            case 11: // and November
                rv = 30;
                break;
            case 2:
                if (Date.isLeapYear(year)) {
                    rv = 29;
                } else {
                    rv = 28;
                }
                break;
            default:
                rv = 31;
                break;
        }
        return rv;
    }

    public void nextDay() {
        addDays(1);
    }

    public void addDays(int days) {
        this.day += days;
        int dayCount;
        while (this.day > (dayCount = Date.daysInMonth(this.month, this.year))) {
            this.day -= dayCount;
            this.month++;
            if (this.month > 12) {
                this.month = 1;
                this.year++;
            }
        }
    }

    public Date(int m, int d, int y) {
        this.day = d;
        this.month = m;
        this.year = y;
    }
}
