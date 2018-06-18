package in.co.trapps.daggerinjection.coffeemaker;

/**
 * @author Akash Patra
 */
public class CoffeeApp implements Runnable {
    CoffeeMaker coffeeMaker;

    @Override
    public void run() {
        coffeeMaker.brew();
    }

    public static void main(String[] args) {
        
    }
}
