package rodatge_v2;

public class ExceptionDniFormatError extends RuntimeException {

	public ExceptionDniFormatError() {
		this ("El DNI no tiene el formato correcto: 00000000X");
	}

	public ExceptionDniFormatError(String exception) {
		super (exception);
	}
	
}
