package in.co.trapps.dagger2.twitter.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import in.co.trapps.dagger2.twitter.OkHttpClient;
import in.co.trapps.dagger2.twitter.TwitterApi;

/**
 * @author Akash Patra
 */
@Module
public class NetworkModule {
    @Provides
    @Singleton
    OkHttpClient provideOkHttpClient() {
        return new OkHttpClient();
    }

    @Provides
    @Singleton
    TwitterApi provideTwitterApi(OkHttpClient client) {
        return new TwitterApi(client);
    }
}
