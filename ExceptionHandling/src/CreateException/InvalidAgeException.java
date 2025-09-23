package CreateException;

public class InvalidAgeException extends Exception {
	public String toString() {
		return " Your age is <18";
	}
}
