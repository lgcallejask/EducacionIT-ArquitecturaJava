package com.example.demo;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
class Consumer {
	
    @Autowired
    UsuarioRepository userRepository;

	private final List<Usuario> messages = new CopyOnWriteArrayList<>();

	@KafkaListener(topics = "topicoUsuarios")
	public void processMessage(Usuario message) {
		this.messages.add(message);
        userRepository.save(message);
		System.out.println("Received sample message [" + message + "]");
	}

	List<Usuario> getMessages() {
            return this.messages;
	}
}
