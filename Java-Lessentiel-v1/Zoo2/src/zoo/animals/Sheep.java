/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo.animals;

/**
 *
 * @author simon
 */
public class Sheep implements Animal {
    @Override
    public void feed() {
        System.out.println("Sheep eats grass, munching happily...");
    }

    @Override
    public void pet() {
        System.out.println("Sheep pushes against your leg and head-butts "
                + "your hand for more attention...");
    }
}
