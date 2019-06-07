package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * @author Georg Praßl and Günther Walenta
 * @last_change 07.06.2019
 * This capacity-restricted queue is designed for holding String elements and works based on the FIFO-principle
 */

public class StringQueue implements Queue {
	/**
	 * Attributes of the class
	 */
	private List<String> elements = new ArrayList<String>();
	private int maxSize = 5;

	/**
	 * Constructor
	 * @param maxsize Defines the maximum number of elements which the queue can hold.
	 */
	public StringQueue(int maxsize){
		maxSize = maxSize;
	}

	/**
	 * Adds the elements to the queue.
	 * @param obj The element which should be added
	 * @return Returns true if successful otherwise false
	 */
	@Override
	public boolean offer(String obj) {
		if(elements.size()< maxSize)
			elements.add(obj);
		else
			return false;
		
		return true;
	}

	/**
	 * Returns the first element and also delete it. If there isn't an element it returns null.
	 * @return first element or null
	 */
	@Override
	public String poll() {
		String element = peek();
		
		if(elements.size() > 0){
			elements.remove(0);
		}
		return element;
	}

	/**
	 * Returns the first element and also delete it. If the queue is empty it throws a NoSuchElementException.
	 * @return returns the removed element
	 */
	@Override
	public String remove() {
		if(elements.size()==0)
			throw new NoSuchElementException("there's no element any more");

		String element = poll();
		return element;
	}

	/**
	 * Returns the head element but does not delete it. If queue is empty it returns null
	 * @return head or null if empty
	 */
	@Override
	public String peek() {
		String element;
		if(elements.size() > 0)
			element = elements.get(0);
		else
			element = null;
		
		return element;
	}
	/**
	 * Returns the head element but does not delete it. If queue is empty it throws a NoSuchElementException
	 * @return head
	 */
	@Override
	public String element() {
		if(elements.size()==0)
			throw new NoSuchElementException("there's no element any more");
		return peek();
	}

}