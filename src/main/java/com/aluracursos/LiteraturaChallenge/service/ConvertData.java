package com.aluracursos.LiteraturaChallenge.service;

import com.aluracursos.LiteraturaChallenge.model.ResultsData;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ConvertData implements IConvertData {

  private ObjectMapper objectMapper = new ObjectMapper();
    @Override
    //public <T> T getData(String url, Class<T> tClass){
    public <T> T getData(String url, Class<T> tClass){

        try {

            return objectMapper.readValue(url,tClass);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }

}

