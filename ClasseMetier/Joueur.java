package ClasseMetier;
import ClasseDialogue.*;

public class Joueur {

    private int vie;
    private Lettre lettre;

    public Joueur(int vie, Lettre lettre) {
		this.vie = vie;
		this.lettre = lettre;
	}
    public Joueur(){
    	this.vie=0;
    	this.lettre = new Lettre();
    }
    public Joueur(int vie){
    	this.vie=vie;
    	this.lettre=new Lettre();
    }
    public int getVie() {
        return this.vie;
    }

    public void setVie(int value) {
        this.vie = value;
    }
    
	public Lettre getLettre() {
		return lettre;
	}

	public void setLettre(Lettre lettre) {
		this.lettre = lettre;
	}

	public String toString() {
		return "Joueur [vie=" + vie + ", lettre=" + lettre + "]";
	}

	public void pointVie() {
			this.setVie(this.vie-1);
    }
}
