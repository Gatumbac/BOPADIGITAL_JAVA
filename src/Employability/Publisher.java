package Employability;

import java.util.*;

public abstract class Publisher {

	Collection<Subscriber> subscribers;

	/**
	 * 
	 * @param observer
	 */
	public void subscribe(Subscriber observer) {
		// TODO - implement Publisher.subscribe
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param observer
	 */
	public void unsubscribe(Subscriber observer) {
		// TODO - implement Publisher.unsubscribe
		throw new UnsupportedOperationException();
	}

	public void notifySubscribers() {
		// TODO - implement Publisher.notifySubscribers
		throw new UnsupportedOperationException();
	}

}