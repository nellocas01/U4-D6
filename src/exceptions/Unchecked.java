package exceptions;

//UNCHECKED
public class Unchecked extends RuntimeException {
	private int number;

	public Unchecked(String message, int number) {
		super(message);
		this.number = number;
	}
}

