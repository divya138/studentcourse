package com.student.student.exception;

public class UserDefinedException extends RuntimeException{
	 
	private static final long serialVersionUID = 1L;

	@Override
      public String getMessage() {
            return "UserDefined Exception is called";
      }
}

