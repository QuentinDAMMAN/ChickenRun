package data;

public abstract class VolailleAVendre extends Volaille implements Comparable<VolailleAVendre> {
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

	@Override
	public int compareTo(VolailleAVendre vol) {
		return Integer.compare(vol.poids, this.poids);
	}
}