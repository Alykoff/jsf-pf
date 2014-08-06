package ru.cinimex.bean;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
//import javax.faces.bean.RequestScoped;
//import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("editor")
//@RequestScoped
@javax.enterprise.context.RequestScoped
public class Editor implements Serializable {
    private String value = "This editor is providedby PF.";
    
    public String doNewBook() {
        return "success";
    }
    
    public String getValue() {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Неверное поведение", "Вы должны вести себя правильно");
        FacesContext.getCurrentInstance().addMessage("editorForm:isbn", msg);
        return value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }
}