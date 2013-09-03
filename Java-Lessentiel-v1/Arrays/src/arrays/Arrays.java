/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author simon
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] values = {1, 1, 2, 3, 5, 8, 13, 21, 34};

        System.out.println("The fifth element of values is " + values[4]);

        System.out.println("There are " + values.length + " elements in values");

        for (int idx = 0; idx < values.length; idx++) {
            System.out.println("values[" + idx + "] is " + values[idx]);
        }

        //values[9] = 55; // doesn't work

        int[] moreValues = new int[20];
        System.arraycopy(values, 0, moreValues, 0, values.length);

        moreValues[9] = 55;
        System.out.println("moreValues[10] is " + moreValues[10]);
        
        int [][] raggedMatrix = {
            { 1, 2, 3 },
            { 4, 5 },
            { 6, 7, 8, 9 }
        };
        
        System.out.println("raggedMatrix[0][2] is " + raggedMatrix[0][2]);


    }
}
