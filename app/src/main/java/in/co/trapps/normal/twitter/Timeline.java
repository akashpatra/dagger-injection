package in.co.trapps.normal.twitter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Akash Patra
 */
public class Timeline {
    private final List<Tweet> cache = new ArrayList<>();
    private final TwitterAPI api;
    private final String user;

    public Timeline(String user, TwitterAPI api) {
        this.user = user;
        this.api = api;
    }

    public List<Tweet> get() {
        return new ArrayList<>();
    }

    public void loadMore(int count) {
        System.out.println("Loaded " + count + " tweets");
    }
}
