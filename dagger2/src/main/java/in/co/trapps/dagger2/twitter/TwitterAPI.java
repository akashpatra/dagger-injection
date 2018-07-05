package in.co.trapps.dagger2.twitter;

/**
 * @author Akash Patra
 */
public class TwitterAPI {
    private final OkHttpClient client;

    public TwitterAPI(OkHttpClient client) {
        this.client = client;
    }

    public void postTweet(String user, String tweet) {

    }
}
