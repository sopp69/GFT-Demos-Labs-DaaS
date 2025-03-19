package com.gft.exceptions;

public class NotIsEquals extends AssertionError {

	private static final long serialVersionUID = 1L;

	public NotIsEquals(String message, Throwable cause) {
		super(message, cause);
	}

}
