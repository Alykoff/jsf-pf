package ru.cinimex.util;

import java.io.Serializable;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.context.SecurityContextHolder;

/**
 *
 * @author galykov
 */
@Named("secUtil")
@ApplicationScoped
public class SecurityUtils implements Serializable {
    public boolean isUserInRole(String role) {
        if (role == null) return false;
        System.out.println("isUserInRole");
//        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        System.out.println(user);
        HttpServletRequest req = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
        return req.isUserInRole(role);
    }
    
    public String getUserName() {
        HttpServletRequest req = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
        if (req == null || req.getUserPrincipal() == null) return "";
        return req.getUserPrincipal().getName();
    }
}
