package in.co.trapps.normal.twitter;

/**
 * @author Akash Patra
 */
public class Tweeter {
    private final TwitterAPI api;
    private final String user;

    public Tweeter(String user, TwitterAPI api) {
        this.user = user;
        this.api = api;
    }

    public void tweet(String tweet) {
        api.postTweet(user, tweet);
    }
}
