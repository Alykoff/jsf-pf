package ru.cinimex.util;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 *
 * @author galykov
 */
@Named("secUtil")
@ApplicationScoped
public class SecurityUtils {
    public boolean isUserInRole(String role) {
        if (role == null) return false;
        System.out.println("isUserInRole");
//        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        HttpServletRequest req = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
        req.getUserPrincipal().getName();
        return req.isUserInRole(role);
    }
    
    public String getUserName() {
        HttpServletRequest req = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
        return req.getUserPrincipal().getName();
    }
}
