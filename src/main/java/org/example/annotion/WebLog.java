package org.example.annotion;

import java.lang.annotation.*;

/**
 * <p>
 *
 * </p>
 *
 * @author zeqiang.sheng
 * @since 2024/2/23
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface WebLog {
}
