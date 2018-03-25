/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.me.exception;

/**
 *
 * @author nanaj
 */
public class MovieException extends Exception {
    
    public MovieException(String message)
	{
		super("MovieException-"+ message);
	}
	
	public MovieException(String message, Throwable cause)
	{
		super("MovieException-"+ message,cause);
	}
}
