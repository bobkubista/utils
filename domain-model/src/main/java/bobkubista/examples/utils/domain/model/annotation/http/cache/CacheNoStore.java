/**
 * Bob Kubista's examples
 */
package bobkubista.examples.utils.domain.model.annotation.http.cache;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * Sets the cache header to the value "No store"
 *
 * @author Bob
 *
 * @see <a href=
 *      'http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9.1'>W3c
 *      Header Field Definitions</a>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface CacheNoStore {

    /**
     * 
     * @return true if a proxy cache should not store the request. Default is
     *         true
     */
    boolean value() default true;
}
