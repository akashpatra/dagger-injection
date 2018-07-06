package in.co.trapps.dagger2SubComp.twitter.component;

import dagger.Subcomponent;
import in.co.trapps.dagger2SubComp.twitter.AScope;
import in.co.trapps.dagger2SubComp.twitter.TwitterApp;
import in.co.trapps.dagger2SubComp.twitter.module.TwitterModule;

/**
 * @author Akash Patra
 */
@AScope
@Subcomponent(modules = TwitterModule.class)
public interface TwitterComponent {
    TwitterApp app();
}
