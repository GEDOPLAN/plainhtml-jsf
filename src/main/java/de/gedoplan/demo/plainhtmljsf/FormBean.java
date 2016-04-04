package de.gedoplan.demo.plainhtmljsf;

import java.io.Serializable;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@ViewScoped
@Named
public class FormBean implements Serializable {

    private String name;

    private String mail;

    private String message;

    public void submit() {
        Logger.getLogger(FormBean.class.getName()).info("Submit...");

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Message from User:" + getName() + " submittet"));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
