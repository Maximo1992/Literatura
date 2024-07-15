package com.aluracursos.LiteraturaChallenge.service;

public interface IConvertData {
    <T> T getData(String url, Class<T> tClass);
}
