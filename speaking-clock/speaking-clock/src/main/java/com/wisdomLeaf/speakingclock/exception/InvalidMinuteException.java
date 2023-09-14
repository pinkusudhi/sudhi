package com.wisdomLeaf.speakingclock.exception;

public class InvalidMinuteException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1252535556681889524L;

	public InvalidMinuteException(String message) {
        super("Invalid minute: " + message);
    }
}
