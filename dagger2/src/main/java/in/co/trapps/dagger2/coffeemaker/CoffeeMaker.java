package in.co.trapps.dagger2.coffeemaker;

import javax.inject.Inject;

/**
 * @author Akash Patra
 */
public class CoffeeMaker {

    Heater heater;
    Pump pump;

    @Inject
    CoffeeMaker(Heater heater, Pump pump) {
        this.heater = heater;
        this.pump = pump;
    }

    public void brew() {
        heater.on();
        pump.pump();
        System.out.println(" [_]P coffee! [_]P ");
        heater.off();
    }
}
