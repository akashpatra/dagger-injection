package in.co.trapps.daggerinjection.type1.coffeemaker;

import javax.inject.Inject;

/**
 * @author Akash Patra
 */
public class Thermosiphon implements Pump {
    private final Heater heater;

    @Inject
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
