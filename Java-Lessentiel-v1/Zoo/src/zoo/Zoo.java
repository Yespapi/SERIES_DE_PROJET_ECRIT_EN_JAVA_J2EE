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

    private Sheep sheep = new Sheep();
    private Lion lion = new Lion();
    private Zebra zebra = new Zebra();

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
        System.out.println("You go to see the sheep, you try to feed it");
        sheep.feed();
        System.out.println("You try to pet the sheep");
        sheep.pet();
        System.out.println("You go to see the lion, you try to feed it");
        lion.feed();
        System.out.println("You try to feed the lion");
        lion.pet();
        System.out.println("You go to see the zebra, you try to feed it");
        zebra.feed();
        System.out.println("You try to feed the zebra");
        zebra.pet();
        
        for (int i = 0; i < animals.length; i++) {
            visitAnimal(animals[i]);
        }
    }

    public static void main(String[] args) {
        Zoo z = new Zoo();
        z.visit(); // take a visit to this zoo.
    }
}
