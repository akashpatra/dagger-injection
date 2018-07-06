package in.co.trapps.dagger2multi.twitter.component;

import javax.inject.Singleton;

import dagger.Component;
import in.co.trapps.dagger2multi.twitter.TwitterApi;
import in.co.trapps.dagger2multi.twitter.module.NetworkModule;

/**
 * @author Akash Patra
 */
@Singleton
@Component(modules = NetworkModule.class)
public interface ApiComponent {
    TwitterApi api();
}
