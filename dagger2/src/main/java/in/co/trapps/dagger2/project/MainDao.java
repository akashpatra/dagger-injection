package in.co.trapps.dagger2.project;

import javax.inject.Inject;

/**
 * @author Akash Patra
 */
public class MainDao implements IMainDao {

    @Inject
    public MainDao() {
    }

    @Override
    public String getResource() {
        return "This is the resource you are looking for.";
    }
}
