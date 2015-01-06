public class Joueur {

    private int vie;
    private Lettre lettre;

    public Joueur(int vie, Lettre lettre) {
		super();
		this.vie = vie;
		this.lettre = lettre;
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

	public int pointVie(String mot) {
		if(!this.lettre.verifierLettreDansMot(mot))
			this.setVie(this.vie-1);
		return this.vie;
    }
}
