/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

/**
 *
 * @author simon
 */
public class Methods {

    public static float average(float[] fa) {
        float sum = 0.0F;
        for (int idx = 0; idx < fa.length; idx++) {
            sum += fa[idx];
        }
        return sum / fa.length;
    }

    // "Overloaded" method name. Argument list must differ
    // to allow compiler to dertermine which method is being
    // called
    public static float average(float[] fa, int first, int last) {
        float sum = 0.0F;
        for (int idx = first; idx <= last; idx++) {
            sum += fa[idx];
        }
        return sum / (1 + last - first);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float[] fa1 = {1.2F, 3.2F, 5.9F, 9.6F};

        float sum = 0.0F;
        for (int idx = 0; idx < fa1.length; idx++) {
            sum += fa1[idx];
        }
        float average = sum / fa1.length;

        System.out.println("Average of the numbers is " + average);

        float[] fa2 = {9.9F, 3.5F, 8.2F, 1.1F, 7.6F, 2.8F};

        sum = 0.0F;
        for (int idx = 0; idx < fa2.length; idx++) {
            sum += fa2[idx];
        }
        average = sum / fa2.length;

        System.out.println("Average of the numbers is " + average);

        System.out.println("Average of the first set of numbers is "
                + average(fa1));
        System.out.println("Average of the second set of numbers is "
                + average(fa2));

        System.out.println("Average of the elements [1] to [4] "
                + "of the second set of numbers is "
                + average(fa2, 1, 4));



    }
}
