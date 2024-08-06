package com.mydemoproject.camundaexample.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.mydemoproject.camundaexample.enumException.ErrorEnum;
import com.mydemoproject.camundaexample.exception.ServiceException;
import com.mydemoproject.camundaexample.model.ValCurs;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Service
public class CurrencyService {

    private final RestTemplate restTemplate;

    public CurrencyService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String fetchCurrencyDataAsJson() throws ServiceException {
        String url = "https://www.cbar.az/currencies/06.08.2024.xml";
        try {
            String xmlResponse = restTemplate.getForObject(url, String.class);

            XmlMapper xmlMapper = new XmlMapper();
            ValCurs valCurs = xmlMapper.readValue(xmlResponse, ValCurs.class);

            ObjectMapper jsonMapper = new ObjectMapper();
            return jsonMapper.writeValueAsString(valCurs);
        } catch (IOException e) {
            throw ServiceException.of(ErrorEnum.CONNECTION_FAILED);
        }

    }

}
