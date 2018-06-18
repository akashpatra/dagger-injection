package in.co.trapps.normal.coffeemaker;

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
