package com.mydemoproject.camundaexample.controller;


import com.mydemoproject.camundaexample.service.CurrencyService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/currency")
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class CurrencyController {

    CurrencyService currencyService;

    @GetMapping
    public String getCurrencyData() {
        return currencyService.fetchCurrencyDataAsJson();
    }
}
