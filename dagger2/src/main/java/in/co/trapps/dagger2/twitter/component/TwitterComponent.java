package in.co.trapps.dagger2.twitter.component;

import javax.inject.Singleton;

import dagger.Component;
import in.co.trapps.dagger2.twitter.TwitterApp;
import in.co.trapps.dagger2.twitter.module.NetworkModule;
import in.co.trapps.dagger2.twitter.module.TwitterModule;

/**
 * @author Akash Patra
 */
@Singleton
@Component(modules = {
        NetworkModule.class,
        TwitterModule.class
})
public interface TwitterComponent {
    TwitterApp app();
}
