package sample.struts1;

import org.apache.struts.action.ActionForm;

public class ActionFormSample extends ActionForm {

    private static final long serialVersionUID = 1L;

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
