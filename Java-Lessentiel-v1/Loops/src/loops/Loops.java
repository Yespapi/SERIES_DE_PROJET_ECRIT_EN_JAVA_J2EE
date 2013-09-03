/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

/**
 *
 * @author simon
 */
public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 0;

        while (a < 10) {
            System.out.println("a is " + a);
            a++;
        }
        System.out.println("Finished the loop");

        while (a < 10) {
            System.out.println("a is " + a);
            a++;
        }
        System.out.println("Finished the second while loop");

        do {
            System.out.println("a is " + a);
            a++;
        } while (a < 10);
        System.out.println("Finished the do/while loop");

        for (int x = 0; x < 10; x++) {
            System.out.println("x is " + x);
        }
        System.out.println("Finished the for loop");
        //System.out.println("x is " + x); // x is out of scope

        for ( ; a < 20; ) { // equivalent to while (a < 20)
            System.out.println("a is " + a++);
        }
        System.out.println("Finished the second for loop");
        
        for (;;) {
            System.out.println("a is " + a++);
            if (a > 25) {
                break;
            }
        }
        System.out.println("Finished the third for loop");
    }
}
