public class Lettre {

    private char lettre;

	public Lettre(char lettre) {
		super();
		this.lettre = lettre;
	}

	public char getLettre() {
		return lettre;
	}

	public void setLettre(char lettre) {
		this.lettre = lettre;
	}

    @Override
	public String toString() {
		return "Lettre [lettre=" + lettre + "]";
	}

	public boolean verifierLettreDansMot(String mot){
    	if(mot.indexOf(this.lettre)!=-1)
    		return true;
    	return false;
    }

}
