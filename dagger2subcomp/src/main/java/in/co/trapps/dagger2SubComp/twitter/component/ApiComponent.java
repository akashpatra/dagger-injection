package in.co.trapps.dagger2SubComp.twitter.component;

import javax.inject.Singleton;

import dagger.Component;
import in.co.trapps.dagger2SubComp.twitter.module.NetworkModule;
import in.co.trapps.dagger2SubComp.twitter.module.TwitterModule;

/**
 * @author Akash Patra
 */
@Singleton
@Component(modules = NetworkModule.class)
public interface ApiComponent {
    TwitterComponent plus(TwitterModule module);
}
