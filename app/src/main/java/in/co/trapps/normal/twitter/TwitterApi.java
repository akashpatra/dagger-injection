package in.co.trapps.normal.twitter;

/**
 * @author Akash Patra
 */
public class TwitterApi {
    private final OkHttpClient client;

    public TwitterApi(OkHttpClient client) {
        this.client = client;
    }

    public void postTweet(String user, String tweet) {
        System.out.println("Tweet is Live");
    }
}
