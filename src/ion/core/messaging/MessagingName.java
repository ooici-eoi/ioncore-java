package ion.core.messaging;

import java.util.UUID;

public class MessagingName {
	private String mName;
	
	public MessagingName(String name) {
		mName  = name;
	}
	
	public String toString() {
		return mName;
	}

	public static MessagingName generateUniqueName() {
		UUID id = UUID.randomUUID();
		return new MessagingName(id.toString());
	}
}
