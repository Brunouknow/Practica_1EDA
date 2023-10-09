package Clases;

import Excepciones.EmptyStackException;
import Excepciones.FullStackException;

public class Estática <T> implements  Stack <T>{
	private int TamañoPila;
	private int cima = -1;
	private T [] ArrayPila;
	
	public Estática (int size) {
		TamañoPila = size;
		ArrayPila = (T[]) new Object [TamañoPila];
	}
	@Override
	public void push(T element) throws FullStackException {
			if (cima == TamañoPila-1) {
				throw new FullStackException ("La pila está llena.");
			} else {
				cima = cima+1;
				ArrayPila[cima] = element;
			}
		}
	
	@Override
	public T pop() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException ("La pila está vacía.");
		} else {
			cima = cima-1;
		}
		return ArrayPila[cima];
	}

	@Override
	public T top() throws EmptyStackException {
			if (isEmpty()) {
				throw new EmptyStackException ("La pila está vacía.");
			} else {
				return ArrayPila[cima];
			}
			}

	@Override
	public boolean isEmpty() {
		return cima < 0;
	}

	@Override
	public int size() {
		return ArrayPila.length+1;
	}
}
