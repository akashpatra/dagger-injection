package in.co.trapps.dagger2.project_arch;

import dagger.Binds;
import dagger.Module;

/**
 * @author Akash Patra
 */
@Module
public interface AppModule {

    @Binds
    IMainBusiness providesMainBusiness(MainBusiness mainBusiness);

    @Binds
    IMainDao provideMainDao(MainDao mainDao);
}
