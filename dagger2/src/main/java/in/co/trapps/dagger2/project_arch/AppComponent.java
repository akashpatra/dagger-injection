package in.co.trapps.dagger2.project_arch;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author Akash Patra
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    // For Constructor Injection
//    Main getMain();

    // For Field Injection
    void inject(Main main);
}
