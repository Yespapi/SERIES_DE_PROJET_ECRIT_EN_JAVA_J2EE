package temperature;

public class Temperature {

    public static int celciusToFahrenheit(int temp) {
        int fTemp = ((9 * temp) / 5) + 32;
        return fTemp;
    }

    public static void examineTemperature(int temp) {
        System.out.println("\nTemperature is "
                + temp + " Celcius. Hmm...");
        
        int fTemp = celciusToFahrenheit(temp);
        
        System.out.println("... that's " + fTemp + " Fahrenheit");
        
        if (fTemp < 45) {
            System.out.println("That's chilly!");
        } else if (fTemp > 80) {
            System.out.println("That's pretty warm.");
        } else {
            System.out.println("That's nothing special.");
        }
    }

    public static void main(String[] args) {
        int[] temperatures = {-10, 5, 25, 38};

        for (int i = 0; i < temperatures.length; i++) {
            examineTemperature(temperatures[i]);
        }
    }
}
