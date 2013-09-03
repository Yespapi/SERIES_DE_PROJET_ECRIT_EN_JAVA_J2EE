/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package packages;

import java.util.Date;
import otherpackage.MyClass;


/**
 *
 * @author simon
 */
public class Packages {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date today = new Date();
        System.out.println("Today is " + today);

        MyClass mc = new MyClass();
        System.out.println("object of MyClass says: " + mc);


    }
}
