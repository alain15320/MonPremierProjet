package priseEnMain.premier;

public class MonPremierProgramme {

	private String prenom;

	public MonPremierProgramme(String prenom) {
		super();
		this.prenom = prenom;
	}
	
	// remarque

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Lance l'application
	 * 
	 * @param args
	 */
	public String moi() {
		return String.format(Messages.getString("MonPremierProgramme.0"), prenom); //$NON-NLS-1$
	}
	
	public void afficher(){
		System.out.println(moi());
	}

}
