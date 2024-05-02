package com.ocorteiz.apifipe.service;

public interface IConverterDados {
    <T> T obterDaddos(String json, Class<T> classT);
}
