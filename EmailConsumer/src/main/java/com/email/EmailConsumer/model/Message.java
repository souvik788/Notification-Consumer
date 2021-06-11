package com.email.EmailConsumer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    private String value;
    private String to;
    private String cc;
    private String emailId;
}
