package com.tease.androidactionstest;

import com.tease.androidlibraryactionstest.HelloMessageFactory;

public class MessageFactory {

    private final HelloMessageFactory message;

    public MessageFactory(String message) {
        this.message = new HelloMessageFactory(message);
    }

    public String message() {
        return message.message();
    }
}
