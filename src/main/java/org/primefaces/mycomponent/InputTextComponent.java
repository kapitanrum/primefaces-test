package org.primefaces.mycomponent;

import javax.faces.component.FacesComponent;
import javax.faces.component.NamingContainer;
import javax.faces.component.UIInput;
import javax.faces.component.UINamingContainer;
import javax.faces.context.FacesContext;

@FacesComponent("inputTextComponent")
public class InputTextComponent extends UIInput implements NamingContainer {

    @Override
    public String getFamily() {
        return UINamingContainer.COMPONENT_FAMILY;
    }

    @Override
    public void decode(FacesContext context) {
        setSubmittedValue(context.getExternalContext().getRequestParameterMap().get(getClientId()));
        super.decode(context);
    }
}
