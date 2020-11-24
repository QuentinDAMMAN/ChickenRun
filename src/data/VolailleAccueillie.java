package data;

import java.util.Date;

public abstract class VolailleAccueillie extends Volaille{
	protected Date dateAdmition;
	
	public VolailleAccueillie() {
		super();
		dateAdmition= new Date();
	}

	public Date getDateAdmition() {
		return dateAdmition;
	}
		
}
