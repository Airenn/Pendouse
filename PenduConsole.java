public class PenduConsole
{
	private Joueur j;
	private Dictionnaire d;
	
	public void afficherMot(String mot)
	{
		int trouve[] = new int[mot.length()];
		
		for(int i = 0; i < mot.length(); i++)
		{
			if(trouve[i] == 0)
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