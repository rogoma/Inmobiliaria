package controllers;

import entidades.Distritos;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;

@Named(value = "distritosController")
@ViewScoped
public class DistritosController extends AbstractController<Distritos> {

    @Inject
    private DepartamentosController departamentoIdController;

    public DistritosController() {
        // Inform the Abstract parent controller of the concrete Distritos?cap_first Entity
        super(Distritos.class);
    }

    /**
     * Resets the "selected" attribute of any parent Entity controllers.
     */
    public void resetParents() {
        departamentoIdController.setSelected(null);
    }

    /**
     * Sets the "selected" attribute of the Departamentos controller in order to
     * display its data in a dialog. This is reusing existing the existing View
     * dialog.
     *
     * @param event Event object for the widget that triggered an action
     */
    public void prepareDepartamentoId(ActionEvent event) {
        if (this.getSelected() != null && departamentoIdController.getSelected() == null) {
            departamentoIdController.setSelected(this.getSelected().getDepartamentoId());
        }
    }
}
