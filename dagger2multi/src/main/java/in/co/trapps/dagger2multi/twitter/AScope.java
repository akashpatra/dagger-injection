package in.co.trapps.dagger2multi.twitter;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * @author Akash Patra
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface AScope {
}
