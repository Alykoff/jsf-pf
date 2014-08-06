package ru.cinimex.bean;

import java.lang.annotation.Documented;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Stereotype;
import javax.inject.Named;

/**
 *
 * @author galykov
 */
@Named
@RequestScoped
@Documented
@Stereotype
@Target({ TYPE, METHOD, FIELD})
@Retention(RUNTIME)
public @interface Model {
}
