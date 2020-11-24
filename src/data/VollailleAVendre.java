package data;

public abstract class VollailleAVendre extends Volaille {
	protected int poids;

	public VollailleAVendre(int pPoids) {
		super();
		this.poids = pPoids;
	}

	public int getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}
	
	

}
