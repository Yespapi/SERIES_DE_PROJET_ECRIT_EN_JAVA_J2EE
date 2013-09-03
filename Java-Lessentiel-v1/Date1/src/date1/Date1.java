/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package date1;

/**
 *
 * @author simon
 */
public class Date1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date meetingDate = new Date(2, 29, 2012);

//        meetingDate.month = 2;
//        meetingDate.day = 29;
//        meetingDate.year = 2012;

        meetingDate.day++;
        System.out.println("Meeting will be on "
                + meetingDate.month + "/"
                + meetingDate.day + "/"
                + meetingDate.year);
        
        Date betterMeetingDate = new Date(2, 29, 2012);
        betterMeetingDate.nextDay();
        System.out.println("Better meeting will be on "
                + betterMeetingDate.month + "/"
                + betterMeetingDate.day + "/"
                + betterMeetingDate.year);

    }
}
