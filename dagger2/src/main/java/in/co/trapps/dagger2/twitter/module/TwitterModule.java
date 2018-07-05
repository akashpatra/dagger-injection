package in.co.trapps.dagger2.twitter.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import in.co.trapps.dagger2.twitter.Timeline;
import in.co.trapps.dagger2.twitter.Tweeter;
import in.co.trapps.dagger2.twitter.TwitterApi;

/**
 * @author Akash Patra
 */
@Module
public class TwitterModule {

    private final String user;

    public TwitterModule(String user) {
        this.user = user;
    }

    @Provides
    @Singleton
    Tweeter provideTwitter(TwitterApi api) {
        return new Tweeter(user, api);
    }

    @Provides
    @Singleton
    Timeline provideTimeline(TwitterApi api) {
        return new Timeline(user, api);
    }
}
