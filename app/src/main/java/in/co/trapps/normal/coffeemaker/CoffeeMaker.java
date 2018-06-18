package in.co.trapps.normal.coffeemaker;

/**
 * @author Akash Patra
 */
public class CoffeeMaker {
    Heater heater;
    Pump pump;

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
