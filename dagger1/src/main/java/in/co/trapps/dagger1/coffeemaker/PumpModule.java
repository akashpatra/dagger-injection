package in.co.trapps.dagger1.coffeemaker;

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
