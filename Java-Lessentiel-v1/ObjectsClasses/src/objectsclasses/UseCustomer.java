/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package objectsclasses;

/**
 *
 * @author simon
 */
public class UseCustomer {
    public static void main(String [] args) {
        Customer a = new Customer("Fred", "123 Acacia Gardens", 100000);
        Customer b = new Customer("Jim", "246 Ivy Lane", 150000);
        Customer c = new Customer("Sheila", "4a Market Hill", 250000);

        System.out.println("Customer b is " + b.getName());
        
        Customer [] toVisit = Customer.getCustomersNearAddress("Timbuktu");
        System.out.println("We have " + toVisit.length + " customers near Timbuktu");
        
        System.out.println("Total customer count is " + Customer.getCustomerCount());
    }
}
