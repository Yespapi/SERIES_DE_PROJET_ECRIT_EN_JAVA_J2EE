/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package structures1;

/**
 *
 * @author simon
 */
public class Structures1 {

    public static void displayAnItem(Item anItem) {
        System.out.println(anItem.name + " comes in "
                + anItem.quantity + " unit packages "
                + " and costs " + anItem.price + " per package");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Item anItem = new Item();
        anItem.name = "Frosty Crunches";
        anItem.price = 250;
        anItem.quantity = 28;

        Item anotherItem = new Item();
        anotherItem.name = "Generic Cereal";
        anotherItem.price = 500;
        anotherItem.quantity = 56;

//        System.out.println(anItem.name + " comes in "
//                + anItem.quantity + " unit packages "
//                + " and costs " + anItem.price + " per package");
//
//        System.out.println(anotherItem.name + " comes in "
//                + anotherItem.quantity + " unit packages "
//                + " and costs " + anotherItem.price + " per package");
        displayAnItem(anItem);
        displayAnItem(anotherItem);

    }
}
