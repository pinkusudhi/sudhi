package com.wisdomLeaf.speakingclock.exception;

public class TimeConversionException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1645882595528902032L;

	public TimeConversionException(String message) {
        super("Time conversion error: " + message);
    }
}
