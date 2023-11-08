package dev.danvega.scf17.handlers;

import org.springframework.stereotype.Service;

@Service
public class Handler {

    public String handleLambdaRequest(String input) {
        return String.valueOf(new StringBuilder(input).reverse());
    }
}
