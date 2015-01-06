import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("12715cba-ba8a-453a-b1f6-a38285001764")
public class Lettre {
    @mdl.prop
    @objid ("cef047be-c086-46e8-8ac7-aeba80148ef7")
    private Dictionnaire mot;

    @mdl.propgetter
    public Dictionnaire getMot() {
        // Automatically generated method. Please do not modify this code.
        return this.mot;
    }

    @mdl.propsetter
    public void setMot(Dictionnaire value) {
        // Automatically generated method. Please do not modify this code.
        this.mot = value;
    }

    @objid ("ee5a1d47-9df6-44c3-8e30-2b546112b790")
    public boolean verifierLettre() {
    }

    @objid ("b3f8e7f3-01eb-432b-b5c8-a078a81c286b")
    public boolean verifierLettreDansMot(String mot) {
    }

}
