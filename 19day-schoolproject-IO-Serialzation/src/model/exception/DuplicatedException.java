package model.exception;

public class DuplicatedException extends Exception {
	
	private static final long serialVersionUID = 2405649247761303345L;
	public DuplicatedException(String message) {
		super(message);
	}
}
