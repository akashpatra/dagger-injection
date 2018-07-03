package in.co.trapps.dagger2.project_arch;

import javax.inject.Inject;

/**
 * @author Akash Patra
 */
public class MainBusiness implements IMainBusiness {
    private IMainDao iMainDao;

    @Inject
    public MainBusiness(IMainDao iMainDao) {
        this.iMainDao = iMainDao;
    }

    @Override
    public String getResource() {
        return iMainDao.getResource();
    }
}
