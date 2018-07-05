package in.co.trapps.normal.twitter;

/**
 * @author Akash Patra
 */
public class TwitterAPI {
    private final OkHttpClient client;

    public TwitterAPI(OkHttpClient client) {
        this.client = client;
    }

    public void postTweet(String user, String tweet) {
        System.out.println("Tweet is Live");
    }
}
