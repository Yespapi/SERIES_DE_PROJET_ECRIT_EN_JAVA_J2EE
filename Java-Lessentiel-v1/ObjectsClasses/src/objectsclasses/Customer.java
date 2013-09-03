/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package objectsclasses;

/**
 *
 * @author simon
 */
public class Customer {
    private String name;
    private String address;
    private int creditLimit;
    
    private static int count = 0;

    public String getAddress() {
        return address;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return "Customer name: " + this.name
                + " address: " + this.address
                + " credit limit " + this.creditLimit;
    }

    public static int getCustomerCount() {
        return count;
    }
    
    public Customer(String name, String address, int creditLimit) {
        this.name = name;
        this.address = address;
        this.creditLimit = creditLimit;
        
        count++;
    }
    
    public static Customer[] getCustomersNearAddress(String address) {
        // search through all customers
        // might need a database to help with this
        // collect the ones that are "near" in an
        // array and return the array when done.
        
        // note that we can't refer to this.name, or this.address,
        // because there is no customer object in the current "context"
        // that is, we didn't send this message to any one customer
        // so how would we know what name or what address to report?
        
        return new Customer[0];
    }
}
