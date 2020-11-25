package data;

public abstract class Volaille {
	protected static int counter;
	protected final int id;

	public Volaille() {
		this.id = counter++;
	}

	public int getId() {
		return this.id;
	}

}
