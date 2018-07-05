package in.co.trapps.normal.twitter;

/**
 * @author Akash Patra
 */
public class Tweeter {
    private final TwitterApi api;
    private final String user;

    public Tweeter(String user, TwitterApi api) {
        this.user = user;
        this.api = api;
    }

    public void tweet(String tweet) {
        api.postTweet(user, tweet);
    }
}
