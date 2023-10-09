package Clases;

import Excepciones.EmptyStackException;

public class Dinámica <T> implements Stack <T>{

	@Override
	public void push(T element) {
		Node <T> aux = new Node <T> (element, top);
		top = aux;
		size++;
	}

	
	@Override
	public Object pop() throws EmptyStackException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object top() throws EmptyStackException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
