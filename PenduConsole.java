public class PenduConsole
{
	private Joueur j;
	private Dictionnaire d;
	private int trouve[];
	
	
	public void afficherMot(String mot)
	{		
		for(int i = 0; i < mot.length(); i++)
		{
			if(this.trouve[i] == 0)
			{
				if(i == mot.length()-1)
					System.out.println("_");
				else
					System.out.print("_.");
			}
			else
			{
				if(i == mot.length()-1)
					System.out.println(mot.charAt(i));
				else
					System.out.print(mot.charAt(i));
			}
		}
	}
}