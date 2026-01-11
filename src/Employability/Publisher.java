package Employability;

import java.util.ArrayList;
import java.util.List;

public abstract class Publisher {

	private List<Subscriber> subscribers;

	public Publisher() {
		this.subscribers = new ArrayList<>();
	}

	public void subscribe(Subscriber observer) {
		subscribers.add(observer);
	}

	public void unsubscribe(Subscriber observer) {
		subscribers.remove(observer);
	}

	// SD-EMP-004: Notificar a todos los suscriptores
	public void notifySubscribers() {
		for (Subscriber subscriber : subscribers) {
			subscriber.update((NotifiableEntity) this);
		}
	}

}