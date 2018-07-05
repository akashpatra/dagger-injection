package in.co.trapps.dagger2.twitter;

import javax.inject.Inject;

import in.co.trapps.dagger2.twitter.component.DaggerTwitterComponent;
import in.co.trapps.dagger2.twitter.component.TwitterComponent;
import in.co.trapps.dagger2.twitter.module.TwitterModule;

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
        TwitterComponent component = DaggerTwitterComponent.builder()
                .twitterModule(new TwitterModule(user))
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
