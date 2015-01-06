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

    @mdl.prop
    @objid ("d789900f-6fcf-4ec6-b844-44ff97d4b4b5")
    private Lettre lettre;

    @mdl.propgetter
    public Lettre getLettre() {
        // Automatically generated method. Please do not modify this code.
        return this.lettre;
    }

    @mdl.propsetter
    public void setLettre(Lettre value) {
        // Automatically generated method. Please do not modify this code.
        this.lettre = value;
    }

    @objid ("5f845256-95db-4f21-a18e-fc29efcc6029")
    public Lettre lettre;

    @objid ("eef7527b-df81-4d1a-94bf-5c03af2e1cea")
    public int pointVie() {
    }

}
