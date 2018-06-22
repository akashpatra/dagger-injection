package in.co.trapps.dagger2.coffeemaker;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author Akash Patra
 */
@Module
public class CoffeeModule {
    @Provides
    @Singleton
    Heater provideHeater() {
        return new ElectricHeater();
    }

//    @Provides
//    static Pump providePump(Thermosiphon pump) {
//        return pump;
//    }
}
