package classeMetier;

public class Lettre {

    private char lettre;

	public Lettre(char lettre) {
		this.lettre = Character.toUpperCase(lettre);
	}
	
	public Lettre(){
		this.lettre=' ';
	}
	public Lettre(String s){
		this.lettre= s.charAt(0);
		Character.toUpperCase(this.lettre);
	}
    
	public char getLettre() {
		return lettre;
	}

	public void setLettre(char lettre) {
		this.lettre =  Character.toUpperCase(lettre);
	}

    @Override
	public String toString() {
		return "Lettre [lettre=" + lettre + "]";
	}

	public boolean verifierLettreDansMot(String mot){
    	if(mot.indexOf(this.lettre)==-1)
    		return false;
		return true;
    }

}
