import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("16759ed1-bdf8-4e1d-a7eb-a206f327c14c")
public class Dictionnaire {
    @mdl.prop
    @objid ("8e40301f-eabf-4f6e-9d08-4c4cbc72f985")
    private List<String> mots = new ArrayList<String> ();

    @mdl.propgetter
    public List<String> getMots() {
        // Automatically generated method. Please do not modify this code.
        return this.mots;
    }

    @mdl.propsetter
    public void setMots(List<String> value) {
        // Automatically generated method. Please do not modify this code.
        this.mots = value;
    }

    @objid ("ff8bb353-6e0e-43b6-9406-3e0b8e9c54a8")
    public void ajouterMot(String mot) {
    }

    @objid ("f79e5650-2aa8-4ec7-8b08-830c3a413f8c")
    public String supprimerMot(String mot) {
    }

    @objid ("fd7dec29-d5cf-44b5-85ea-024822cca8e6")
    public boolean verifierMotAjout(String mot) {
    }

    @objid ("8383dc7a-842b-46d9-8b25-9c2bf6700103")
    public boolean verifierMotSuppr(String mot) {
    }

}
