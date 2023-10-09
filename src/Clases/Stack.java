package Clases;

import Excepciones.EmptyStackException;
import Excepciones.FullStackException;

public interface Stack <T> {
	// No es necesario poner que son públicos.
	public void push (T element) throws FullStackException;
	
	public T pop() throws EmptyStackException;
		
	public T top() throws EmptyStackException;
	
	public boolean isEmpty();
	
	public int size();
	
	public String toString();

}

