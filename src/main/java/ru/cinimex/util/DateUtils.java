/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.cinimex.util;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author galykov
 */
@Named("dateUtils")
@ApplicationScoped
public class DateUtils implements Serializable {
    private static final String SIMPLE_DATE_FORMAT = "dd/MM/yyyy";
    
    public String currentSimpleFormatDate() {
        DateFormat df = new SimpleDateFormat(SIMPLE_DATE_FORMAT);
        Date date = new Date();
        String result = df.format(date);
        System.out.println("Current Date " + result);
        return result;
    }
}
