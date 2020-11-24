package data;

public abstract class VollailleAVendre extends Volaille {
	protected int poids;

	public VollailleAVendre(int pId, int pPoids) {
		super(pId);
		this.poids = pPoids;
	}

}
