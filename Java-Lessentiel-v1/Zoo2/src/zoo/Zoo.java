/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import zoo.animals.Animal;
import zoo.animals.Lion;
import zoo.animals.Sheep;
import zoo.animals.Zebra;

/**
 *
 * @author simon
 */
public class Zoo {

    private Animal [] animals = {
        new Sheep(), new Lion(), new Zebra()
    };
    
    public void visitAnimal(Animal animal) {
        System.out.println("Try to feed the animal");
        animal.feed();
        System.out.println("Try to pet the animal");
        animal.pet();
    }
    
    public void visit() {
        System.out.println("You visit the zoo...");
        for (int i = 0; i < animals.length; i++) {
            visitAnimal(animals[i]);
        }
    }

    public static void main(String[] args) {
        Zoo z = new Zoo();
        z.visit(); // take a visit to this zoo.
    }
}
