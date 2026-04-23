package UserDefinedException;
//unchecked
public class InsufficientBalance extends RuntimeException {
	public InsufficientBalance(String msg) {
		System.out.println(msg);
	}
}
