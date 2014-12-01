package sample.struts1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class ActionSample extends DispatchAction {
    public ActionForward ignore_true(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) {

        MessageBean mBean = new MessageBean();
        mBean.setMessage("Hello world!");
        request.setAttribute("mBean", mBean);
        return mapping.findForward("ignore_true");
    }

    public ActionForward ignore_false(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response) {

        MessageBean mBean = new MessageBean();
        mBean.setMessage("Hello world!");
        request.setAttribute("mBean", mBean);
        return mapping.findForward("ignore_false");
    }
}
