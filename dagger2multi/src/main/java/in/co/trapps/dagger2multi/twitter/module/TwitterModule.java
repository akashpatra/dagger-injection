package in.co.trapps.dagger2multi.twitter.module;

import dagger.Module;
import dagger.Provides;
import in.co.trapps.dagger2multi.twitter.AScope;
import in.co.trapps.dagger2multi.twitter.Timeline;
import in.co.trapps.dagger2multi.twitter.Tweeter;
import in.co.trapps.dagger2multi.twitter.TwitterApi;

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
    @AScope
    Tweeter provideTwitter(TwitterApi api) {
        return new Tweeter(user, api);
    }

    @Provides
    @AScope
    Timeline provideTimeline(TwitterApi api) {
        return new Timeline(user, api);
    }
}
