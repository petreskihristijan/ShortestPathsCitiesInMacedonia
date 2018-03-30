package shortestpathscitiesinmacedonia;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

public class Bag<T> implements Iterable<T> {
	private Node<T> first;
	private int n;
	
	private static class Node<T>{
		private T item;
		private Node<T> next;
	}
	
	public Bag() {
		first = new Node<T>();
		n = 0;
	}
	
	public boolean isEmpty() {
		return first==null;
	}
	
	public int size() {
		return n;
	}
	
	public void add(T item) {
		Node<T> oldFirst = first;
		first = new Node<T>();
		first.item = item;
		first.next = oldFirst;
		n++;
	}
	
	@Override
	public Iterator<T> iterator() {
		return new ListIterator<T>(first);
	}

	private class ListIterator<T> implements Iterator<T>{
		private Node<T> current;
		private Stack<Node<T>> stack;
		
		public ListIterator(Node<T> first) {
			current = first;
		}
	
		@Override
		public boolean hasNext() {
			return current.next != null;
		}

		@Override
		public T next() {
			if(!hasNext()) throw new NoSuchElementException();
			T item = current.item;
			current = current.next;
			return item;
		}
	}
	
	public static void main(String[] args) {
		Bag<String> bag = new Bag<String>();
		bag.add("add");
		bag.add("me");
		bag.add("well");
		bag.add("Pece");
		for(String i : bag) {
			System.out.println(i);
		}
	}
}
