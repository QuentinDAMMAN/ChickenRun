package data;
import java.util.Date;
public abstract class VolailleAccueillie extends Volaille implements Comparable<VolailleAccueillie> {
	protected Date dateAdmition;
	public VolailleAccueillie() {
		super();
		dateAdmition = new Date();
	}
	public Date getDateAdmition() {
		return dateAdmition;
	}
	@Override
	public int compareTo(VolailleAccueillie vol) {
		return this.dateAdmition.compareTo(vol.dateAdmition);
	}
}