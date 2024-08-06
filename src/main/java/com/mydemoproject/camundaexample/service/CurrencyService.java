package com.mydemoproject.camundaexample.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.mydemoproject.camundaexample.info.ValCurs;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Service
public class CurrencyService {

    private final RestTemplate restTemplate;

    public CurrencyService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String fetchCurrencyDataAsJson() throws IOException {
        String url = "https://www.cbar.az/currencies/06.08.2024.xml";
        String xmlResponse = restTemplate.getForObject(url, String.class);


        XmlMapper xmlMapper = new XmlMapper();
        ValCurs valCurs = xmlMapper.readValue(xmlResponse, ValCurs.class);


        ObjectMapper jsonMapper = new ObjectMapper();
        return jsonMapper.writeValueAsString(valCurs);
    }

}
