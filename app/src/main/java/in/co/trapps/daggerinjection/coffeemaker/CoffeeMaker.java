package in.co.trapps.daggerinjection.coffeemaker;

/**
 * @author Akash Patra
 */
public class CoffeeMaker {
    Heater heater;
    Pump pump;

    public void brew() {
        heater.on();
        pump.pump();
        System.out.println(" [_]P coffee! [_]P ");
        heater.off();
    }
}
