package in.co.trapps.daggerinjection.type1.coffeemaker;

import dagger.Module;
import dagger.Provides;

/**
 * @author Akash Patra
 */
@Module(complete = false, library = true)
public class PumpModule {
    @Provides
    Pump providePump(Thermosiphon pump) {
        return pump;
    }
}
