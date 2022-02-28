package com.psalqvist.sfgdi.services;

import org.springframework.stereotype.Service;
// have to tell spring that this is a service we need in the context
// otherwise it will be null
@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
