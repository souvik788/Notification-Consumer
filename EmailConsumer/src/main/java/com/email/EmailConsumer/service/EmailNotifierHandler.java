package com.email.EmailConsumer.service;

import com.email.EmailConsumer.model.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class EmailNotifierHandler {
    Logger log = LoggerFactory.getLogger(EmailNotifierHandler.class);

    @Bean
    public Consumer<Message> consumeNotification() {
        return message -> log.info(message.getValue());
    }
}
