package custom_exceptions;


@SuppressWarnings("serial")
public class CustomerHandlingException extends Exception {
	public CustomerHandlingException(String errMesg) {
		super(errMesg);
	}

}
