/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.cinimex.util;

import java.io.Serializable;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author galykov
 */
@ApplicationScoped
@Named("systemInfoUtils")
public class SystemInfoUtils implements Serializable {
    public String getVersionApp() {
        return "0.0.1";
    }
    
    public String getRootUrl() {
        return "http://localhost:8080/pf-tst2/";
    }

    public String getEnviromentInfo() {
        return System.getProperty("java.version") 
                + "\n" + System.getProperty("java.vendor")
                + ";\r\n" + "Tomcat 7.0.55;"
                + "\r\n" + "JSF 2.2;"
                + "\r\n" + "PrimeFaces 5.0;"
                + "\r\n" + "Spring Security 3.2.4.RELEASE";
    }
}
