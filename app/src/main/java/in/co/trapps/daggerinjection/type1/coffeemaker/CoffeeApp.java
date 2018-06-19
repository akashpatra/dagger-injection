package in.co.trapps.daggerinjection.type1.coffeemaker;

import javax.inject.Inject;

import dagger.ObjectGraph;

/**
 * @author Akash Patra
 */
public class CoffeeApp implements Runnable {
    @Inject
    CoffeeMaker coffeeMaker;

    @Override
    public void run() {
        coffeeMaker.brew();
    }

    public static void main(String[] args) {
        ObjectGraph objectGraph = ObjectGraph.create(new CoffeeModule());
        CoffeeApp coffeeApp = objectGraph.get(CoffeeApp.class);
        coffeeApp.run();
    }
}
