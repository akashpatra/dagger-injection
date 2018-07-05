package in.co.trapps.dagger2.twitter;

/**
 * @author Akash Patra
 */
public class Tweeter {
    private final TwitterAPI api = new TwitterAPI(new OkHttpClient());
    private final String user;

    public Tweeter(String user) {
        this.user = user;
    }

    public void tweet(String tweet) {
        api.postTweet(user, tweet);
    }
}
