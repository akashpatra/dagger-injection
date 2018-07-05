package in.co.trapps.dagger1.coffeemaker;

import javax.inject.Inject;

/**
 * @author Akash Patra
 */
public class CoffeeMaker {
    @Inject
    Heater heater;

    @Inject
    Pump pump;

    public void brew() {
        heater.on();
        pump.pump();
        System.out.println(" [_]P coffee! [_]P ");
        heater.off();
    }
}
