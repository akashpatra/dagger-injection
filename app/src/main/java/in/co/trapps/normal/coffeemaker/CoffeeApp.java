package in.co.trapps.normal.coffeemaker;

/**
 * @author Akash Patra
 */
public class CoffeeApp implements Runnable {
    static CoffeeMaker coffeeMaker;

    @Override
    public void run() {
        coffeeMaker.brew();
    }

    public static void main(String[] args) {
        Heater heater = new ElectricHeater();
        Pump pump = new Thermosiphon(heater);
        coffeeMaker = new CoffeeMaker(heater, pump);

        CoffeeApp coffeeApp = new CoffeeApp();
        coffeeApp.run();
    }
}
