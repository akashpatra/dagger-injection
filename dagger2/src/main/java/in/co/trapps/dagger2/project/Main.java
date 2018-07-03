package in.co.trapps.dagger2.project;

import javax.inject.Inject;

/**
 * @author Akash Patra
 */
public class Main {
    private IMainBusiness mainBusiness;

    @Inject
    Main(IMainBusiness iMainBusiness) {
        this.mainBusiness = iMainBusiness;
    }

    public static void main(String[] args) {
        System.out.println("Hi");
        AppComponent appComponent = DaggerAppComponent.create();
        Main main = appComponent.getMain();
        System.out.println(main.mainBusiness.getResource());
    }
}