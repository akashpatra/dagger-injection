package in.co.trapps.dagger2.project;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author Akash Patra
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    // For Field Injection
//    void inject(Main main);

    // For Constructor Injection
    Main getMain();
}
