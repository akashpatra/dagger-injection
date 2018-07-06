package in.co.trapps.dagger2multi.twitter;

import javax.inject.Inject;

import in.co.trapps.dagger2multi.twitter.component.ApiComponent;
import in.co.trapps.dagger2multi.twitter.component.DaggerApiComponent;
import in.co.trapps.dagger2multi.twitter.component.DaggerTwitterComponent;
import in.co.trapps.dagger2multi.twitter.component.TwitterComponent;
import in.co.trapps.dagger2multi.twitter.module.TwitterModule;

/**
 * @author Akash Patra
 */
public class TwitterApp implements Runnable {
    private final Tweeter tweeter;
    private final Timeline timeline;

    @Inject
    public TwitterApp(Tweeter tweeter, Timeline timeline) {
        this.tweeter = tweeter;
        this.timeline = timeline;
    }

    public static void main(String[] args) {
        String user = "Akash";

        // Get a instance of Component
        ApiComponent apiComponent = DaggerApiComponent.create();
        TwitterComponent component = DaggerTwitterComponent.builder()
                .twitterModule(new TwitterModule(user))
                .apiComponent(apiComponent)
                .build();

        component.app().run();
    }

    @Override
    public void run() {
        // Tweet
        tweeter.tweet("Hello, Trapps");
        tweeter.tweet("Dagger is Awesome !!!");
        tweeter.tweet("It reduces the boiler plate code.");

        // Timeline
        timeline.loadMore(10);
        for (Tweet tweet : timeline.get()) {
            System.out.println(tweet);
        }
    }
}
