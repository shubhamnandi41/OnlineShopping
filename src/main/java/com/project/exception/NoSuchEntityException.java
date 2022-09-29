package com.project.exception;

@SuppressWarnings("serial")
public class NoSuchEntityException extends Exception {

	public NoSuchEntityException(String err) {
		super(err);
	}
}
