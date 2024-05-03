package com.ocorteiz.apifipe.service;

import java.util.List;

public interface IConverterDados {
    <T> T obterDados(String json, Class<T> classT);
    <T> List<T> obterLista(String json, Class<T> classT);
}
