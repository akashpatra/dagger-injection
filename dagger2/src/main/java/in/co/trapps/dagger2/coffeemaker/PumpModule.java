package in.co.trapps.dagger2.coffeemaker;

import dagger.Module;
import dagger.Provides;

/**
 * @author Akash Patra
 */
@Module
public class PumpModule {
    @Provides
    Pump providePump(Thermosiphon pump) {
        return pump;
    }
}
