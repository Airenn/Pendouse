package classeMetier;
import java.util.*;

public class Dictionnaire {

    private List<String> mots = new ArrayList<String> ();


    public List<String> getMots() {
        return this.mots;
    }

    public Dictionnaire(List<String> mots) {
		super();
		this.mots = mots;
	}
    public Dictionnaire(){
    	this.mots=new ArrayList<String>();
    }
	public String toString() {
		return "Dictionnaire [mots=" + mots + "]";
	}
	
	public String motAleatoire(){
		int random = (int)(Math.random() * (this.mots.size()));
		return this.mots.get(random);
	}

	public void setMots(List<String> value) {
        this.mots = value;
    }


    public void ajouterMot(String mot) {
    	if(verifierMotAjout(mot))
    		this.mots.add(mot.toUpperCase());
    }


    public String supprimerMot(String mot) {
    	if(verifierMotSuppr(mot.toUpperCase())){
    		String var = mot;
    		this.mots.remove(mot.toUpperCase());
    		return var;
    	}
    	else
    		return null;
    }

   
    public boolean verifierMotAjout(String mot) {
    	if(this.mots.indexOf(mot)==-1)
    		return true;
    	return false;
    }


    public boolean verifierMotSuppr(String mot){
    	if(this.mots.indexOf(mot)!=-1)
    		return true;
    	return false;
    }

}
