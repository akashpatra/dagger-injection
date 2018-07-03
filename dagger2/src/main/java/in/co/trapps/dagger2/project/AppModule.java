package in.co.trapps.dagger2.project;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author Akash Patra
 */
@Module
public class AppModule {

    @Provides
    @Singleton
    public IMainBusiness providesMainBusiness(MainBusiness mainBusiness) {
        return mainBusiness;
    }

    @Provides
    @Singleton
    public IMainDao provideMainDao(MainDao mainDao) {
        return mainDao;
    }
}
