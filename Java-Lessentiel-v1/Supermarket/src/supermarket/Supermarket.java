package supermarket;

/**
 *
 * @author simon
 */
public class Supermarket {

    public static float pricePerUnit(int price, int quantity) {
        return (float)price/(float)quantity;
    }

    public static void main(String[] args) {
        String [][] productNames = {
            {"Frosty Crunches", "Generic Cereal"},
            {"Soft'n'strong", "PlainBrand tissue"},
            {"Baking Chocolate bar", "Swiss Chocolate"}
        };
        
        int [][] prices = {
            {250, 500},
            {975, 1428},
            {245, 325}
        };

        int [][] quantities = {
            {28, 56},
            {900, 2000},
            {14, 9}
        };
        
        for (int idx = 0; idx < productNames.length; idx++) {
            float pricePerUnitA = pricePerUnit(prices[idx][0], quantities[idx][0]);
            float pricePerUnitB = pricePerUnit(prices[idx][1], quantities[idx][1]);
            if (pricePerUnitA < pricePerUnitB) {
                System.out.println("It's cheaper to buy " + productNames[idx][0]
                        + " at " + pricePerUnitA + " per unit than to buy"
                        + productNames[idx][1] + " at "+ pricePerUnitB + " per unit");
            } else if(pricePerUnitA == pricePerUnitB) {
                System.out.println("Both " + productNames[idx][0] + " and "
                        + productNames[idx][1] + " cost "+ pricePerUnitB + " per unit");
            } else {
                System.out.println("It's cheaper to buy " + productNames[idx][1]
                        + " at " + pricePerUnitB + " per unit than to buy"
                        + productNames[idx][0] + " at "+ pricePerUnitA + " per unit");
            }
        }
    }
}
