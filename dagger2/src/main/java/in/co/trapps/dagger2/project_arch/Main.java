package in.co.trapps.dagger2.project_arch;

import javax.inject.Inject;

/**
 * @author Akash Patra
 */
public class Main {
    // Constructor Injection
    /*private IMainBusiness mainBusiness;

    @Inject
    Main(IMainBusiness iMainBusiness) {
        this.mainBusiness = iMainBusiness;
    }*/

    // Field Injection
    @Inject
    IMainBusiness mainBusiness;

    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println("*** Hi, Welcome to Dagger World ***");
        System.out.println("\n");

        AppComponent appComponent = DaggerAppComponent.create();

        // Constructor Injection
//        Main main = appComponent.getMain();

        // Field Injection
        Main main = new Main();
        appComponent.inject(main);

        System.out.println(main.mainBusiness.getResource());
    }
}
