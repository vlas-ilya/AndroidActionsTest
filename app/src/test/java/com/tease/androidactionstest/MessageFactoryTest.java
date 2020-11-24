package com.tease.androidactionstest;

import com.tease.androidlibraryactionstest.HelloMessageFactory;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class MessageFactoryTest {
    private MessageFactory factory;

    @Before
    public void setUp() {
        factory = new MessageFactory("Hello world!");
    }

    @Test
    public void message() {
        String message = factory.message();
        assertEquals(message, "Hello world!");
    }
}