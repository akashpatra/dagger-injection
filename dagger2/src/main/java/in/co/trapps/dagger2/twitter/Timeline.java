package in.co.trapps.dagger2.twitter;

/**
 * @author Akash Patra
 */

public class Timeline {
    private final TwitterAPI api = new TwitterAPI(new OkHttpClient());
}
