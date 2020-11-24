package data;

public abstract class Volaille {

	protected final int id;
	public final static int MAX_VOLLAILLE = 7;
	public final static int MAX_POULETS = 5;
	public final static int MAX_CANARDS = 4;
	public final static int MAX_PAONS = 3;
	
	
	public Volaille(int pId) {
		this.id = pId;
		
	}

}
