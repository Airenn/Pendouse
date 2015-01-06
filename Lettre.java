import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("12715cba-ba8a-453a-b1f6-a38285001764")
public class Lettre {
    @mdl.prop
    @objid ("eff8eed5-10a0-4b92-b22e-5cecff2a04df")
    private char lettre;

    @mdl.propgetter
    public char getLettre() {
        // Automatically generated method. Please do not modify this code.
        return this.lettre;
    }

    @mdl.propsetter
    public void setLettre(char value) {
        // Automatically generated method. Please do not modify this code.
        this.lettre = value;
    }

    @objid ("ee5a1d47-9df6-44c3-8e30-2b546112b790")
    public boolean verifierLettre() {
    }

    @objid ("b3f8e7f3-01eb-432b-b5c8-a078a81c286b")
    public boolean verifierLettreDansMot(String mot) {
    }

}
