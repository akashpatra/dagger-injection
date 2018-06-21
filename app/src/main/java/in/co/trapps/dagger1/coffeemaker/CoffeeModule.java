package in.co.trapps.dagger1.coffeemaker;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author Akash Patra
 */
@Module(
        injects = CoffeeApp.class,
        includes = PumpModule.class
)
public class CoffeeModule {
    @Provides
    @Singleton
    Heater provideHeater() {
        return new ElectricHeater();
    }
}
