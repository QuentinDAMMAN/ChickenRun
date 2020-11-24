package data;

public abstract class VolailleAVendre extends Volaille {
	protected int poids;

	public VolailleAVendre(int pPoids) {
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
