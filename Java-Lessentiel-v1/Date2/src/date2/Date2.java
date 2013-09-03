/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package date2;

/**
 *
 * @author simon
 */
public class Date2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date meetingDate = new Date(2, 29, 2012);

        //meetingDate.day++;
        meetingDate.nextDay();
        System.out.println("Meeting will be on "
                + meetingDate.getMonth() + "/"
                + meetingDate.getDay() + "/"
                + meetingDate.getYear());
        
        Date betterMeetingDate = new Date(2, 29, 2012);
        betterMeetingDate.nextDay();
        System.out.println("Better meeting will be on " + betterMeetingDate);
//                + betterMeetingDate.month + "/"
//                + betterMeetingDate.day + "/"
//                + betterMeetingDate.year);
    }
}
