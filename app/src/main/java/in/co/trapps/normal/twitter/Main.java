package in.co.trapps.normal.twitter;

/**
 * @author Akash Patra
 */
public class Main {
    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient();
        TwitterAPI api = new TwitterAPI(client);
        String user = "Akash";

        // Tweet
        Tweeter tweeter = new Tweeter(user, api);
        tweeter.tweet("Hello, Trapps");
        tweeter.tweet("Dagger is Awesome !!!");
        tweeter.tweet("It reduces the boiler plate code.");

        // Timeline
        Timeline timeline = new Timeline(user, api);
        timeline.loadMore(10);
        for (Tweet tweet : timeline.get()) {
            System.out.println(tweet);
        }
    }
}
