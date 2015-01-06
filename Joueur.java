import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("afc6d5dc-d407-4956-a969-fc9446dc146b")
public class Joueur {
    @mdl.prop
    @objid ("0dd3d5c0-688a-4a40-981a-ef55c4ddaed2")
    private int vie;

    @mdl.propgetter
    public int getVie() {
        // Automatically generated method. Please do not modify this code.
        return this.vie;
    }

    @mdl.propsetter
    public void setVie(int value) {
        // Automatically generated method. Please do not modify this code.
        this.vie = value;
    }

    @objid ("9bec6666-415b-4425-aad8-405b26e678d9")
    private Lettre lettre;

    @objid ("eef7527b-df81-4d1a-94bf-5c03af2e1cea")
    public int pointVie() {
    }

}
