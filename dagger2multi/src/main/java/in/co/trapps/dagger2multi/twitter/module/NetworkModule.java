package in.co.trapps.dagger2multi.twitter.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import in.co.trapps.dagger2multi.twitter.OkHttpClient;
import in.co.trapps.dagger2multi.twitter.TwitterApi;

/**
 * @author Akash Patra
 */
@Module
public class NetworkModule {
    @Provides @Singleton
    OkHttpClient provideOkHttpClient() {
        System.out.println("OkHttpClient Cons");
        return new OkHttpClient();
    }

    @Provides @Singleton
    TwitterApi provideTwitterApi(OkHttpClient client) {
        return new TwitterApi(client);
    }
}
