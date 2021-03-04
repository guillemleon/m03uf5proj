package rodatge_v2;

public class DurationExceedsLimits extends RuntimeException {

	public DurationExceedsLimits() {
		this("Ninguna escena puede tener una duracion mayor a 20 minutos");
	}

	public DurationExceedsLimits(String exception) {
		super (exception);
	}
	
	
	
}
