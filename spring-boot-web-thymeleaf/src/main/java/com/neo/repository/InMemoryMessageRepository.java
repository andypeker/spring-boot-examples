

package com.neo.repository;

import com.neo.model.Message;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;


public class InMemoryMessageRepository implements MessageRepository {

	private static AtomicLong counter = new AtomicLong();
	private final ConcurrentMap<Long, Message> messages = new ConcurrentHashMap<>();

	@Override
	public Iterable<Message> findAll() {
		return this.messages.values();
	}

	@Override
	public Message save(Message message) {
		Long id = message.getId();
		if (id == null) {
			id = counter.incrementAndGet();
			message.setId(id);
		}
		this.messages.put(id, message);
		return message;
	}

	@Override
	public Message findMessage(Long id) {
		return this.messages.get(id);
	}

	@Override
	public void deleteMessage(Long id) {
		this.messages.remove(id);
	}

	public void logAllMsgs(){
		for (Map.Entry<Long, Message> e : this.messages.entrySet()) {
			System.out.println("k = " + e.getKey() + ", v = " + e.getValue().toString());
		}
	}

}
