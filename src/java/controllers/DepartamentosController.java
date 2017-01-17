package controllers;

import entidades.Departamentos;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "departamentosController")
@ViewScoped
public class DepartamentosController extends AbstractController<Departamentos> {

    @Inject
    private DistritosController distritosListController;

    public DepartamentosController() {
        // Inform the Abstract parent controller of the concrete Departamentos?cap_first Entity
        super(Departamentos.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
    }

    /**
     * Sets the "items" attribute with a collection of Distritos entities that
     * are retrieved from Departamentos?cap_first and returns the navigation
     * outcome.
     *
     * @return navigation outcome for Distritos page
     */
    public String navigateDistritosList() {
        if (this.getSelected() != null) {
            FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("Distritos_items", this.getSelected().getDistritosList());
        }
        return "/distritos/index";
    }

}
