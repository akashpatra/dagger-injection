package in.co.trapps.dagger2.coffeemaker;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author Akash Patra
 */
@Singleton
@Component(modules = {CoffeeModule.class, PumpModule.class})
public interface CoffeeShop {
    // Constructor Injection
//    CoffeeApp app();

    // Field Injection
    void inject(CoffeeApp app);
}
