package in.co.trapps.daggerinjection.coffeemaker;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author Akash Patra
 */
@Module(
        injects = CoffeeApp.class
)
public class CoffeeModule {
    @Provides
    @Singleton
    Heater provideHeater() {
        return new ElectricHeater();
    }

    @Provides
    Pump providePump(Thermosiphon pump) {
        return pump;
    }
}
