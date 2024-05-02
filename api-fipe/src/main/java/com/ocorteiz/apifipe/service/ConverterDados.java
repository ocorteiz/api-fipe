package com.ocorteiz.apifipe.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverterDados implements IConverterDados{
    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T obterDaddos(String json, Class<T> classT) {
        try {
            return mapper.readValue(json, classT);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
