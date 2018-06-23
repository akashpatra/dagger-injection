package in.co.trapps.dagger2.coffeemaker;

import javax.inject.Inject;

/**
 * @author Akash Patra
 */
public class CoffeeApp implements Runnable {
    // Field Injection
    @Inject
    CoffeeMaker coffeeMaker;

    // Constructor Injection
    /*@Inject
    CoffeeApp(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }*/

    @Override
    public void run() {
        coffeeMaker.brew();
    }

    public static void main(String[] args) {
        // Way 1
//        CoffeeComponent coffeeComponent = DaggerCoffeeComponent.builder()
//                .build();

        // Way 2
        CoffeeComponent coffeeComponent = DaggerCoffeeComponent.create();

        // Constructor Injection
//        CoffeeApp app = coffeeComponent.app();
//        app.run();

        // Field Injection
        CoffeeApp app = new CoffeeApp();
        coffeeComponent.inject(app);
        app.run();
    }
}
