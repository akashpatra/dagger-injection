package in.co.trapps.dagger2multi.twitter.component;

import dagger.Component;
import in.co.trapps.dagger2multi.twitter.AScope;
import in.co.trapps.dagger2multi.twitter.TwitterApp;
import in.co.trapps.dagger2multi.twitter.module.TwitterModule;

/**
 * @author Akash Patra
 */
@AScope
@Component(
        dependencies = ApiComponent.class,
        modules = TwitterModule.class
)
public interface TwitterComponent {
    TwitterApp app();
}
