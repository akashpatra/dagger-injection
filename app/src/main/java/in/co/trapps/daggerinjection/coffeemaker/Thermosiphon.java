package in.co.trapps.daggerinjection.coffeemaker;

/**
 * @author Akash Patra
 */
public class Thermosiphon implements Pump {
    private final Heater heater;

    Thermosiphon(Heater heater) {
        this.heater = heater;
    }

    @Override
    public void pump() {
        if (heater.isHot()) {
            System.out.println("=> => pumping => =>");
        }
    }
}
