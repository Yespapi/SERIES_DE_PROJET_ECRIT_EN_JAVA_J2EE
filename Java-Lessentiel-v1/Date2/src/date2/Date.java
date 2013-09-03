/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package date2;

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

    public boolean isLeapYear(int year) {
        return (((year % 4) == 0) && ((year % 100) != 0)) || ((year % 400) == 0);
    }
    
    public int daysInMonth(int month, int year) {
        int rv;
        switch(month) {
            case 9: // Thirty days hath September
            case 4: // April...
            case 6: // June...
            case 11: // and November
                rv = 30;
                break;
            case 2:
                if (isLeapYear(year)) {
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
        int dayCount = daysInMonth(this.month, this.year);
        this.day++;
        if (this.day > dayCount) {
            this.day = 1;
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
