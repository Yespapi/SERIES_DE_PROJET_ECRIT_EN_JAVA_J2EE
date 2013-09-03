/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package objectsclasses;

/**
 *
 * @author simon
 */
public class UseDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date betterMeetingDate = new Date(1, 31, 2011);
        betterMeetingDate.nextDay();
        System.out.println("Better meeting will be on " + betterMeetingDate);
        betterMeetingDate.addDays(7);
        System.out.println("Better meeting will be on " + betterMeetingDate);
        betterMeetingDate.addDays(21);
        System.out.println("Better meeting will be on " + betterMeetingDate);
        betterMeetingDate.addDays(3650);
        System.out.println("Better meeting will be on " + betterMeetingDate);
    }
}
