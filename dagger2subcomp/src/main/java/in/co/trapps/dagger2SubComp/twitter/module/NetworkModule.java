package in.co.trapps.dagger2SubComp.twitter.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import in.co.trapps.dagger2SubComp.twitter.OkHttpClient;
import in.co.trapps.dagger2SubComp.twitter.TwitterApi;

/**
 * @author Akash Patra
 */
@Module
public class NetworkModule {
    @Provides @Singleton
    OkHttpClient provideOkHttpClient() {
        return new OkHttpClient();
    }

    @Provides @Singleton
    TwitterApi provideTwitterApi(OkHttpClient client) {
        return new TwitterApi(client);
    }
}
