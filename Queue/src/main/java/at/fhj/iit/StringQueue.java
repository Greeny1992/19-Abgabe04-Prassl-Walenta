package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * @author Georg Prassl and Guenther Walenta
 * last_change: 07.06.2019
 * This capacity-restricted queue is designed for holding String elements and works based on the FIFO-principle
 */

public class StringQueue implements Queue {
    private static final Logger logger = LogManager.getLogger(StringQueue.class);
	/**
	 * Attributes of the class
	 */
	private List<String> elements = new ArrayList<>();
	private int maxSize = 5;

	/**
	 * Constructor
	 * @param maxSize Defines the maximum number of elements which the queue can hold.
	 */
	public StringQueue(int maxSize){
		this.maxSize = maxSize;
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

		return poll();
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