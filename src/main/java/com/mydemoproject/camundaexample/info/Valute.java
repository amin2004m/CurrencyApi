package com.mydemoproject.camundaexample.info;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Valute {


    @JacksonXmlProperty(isAttribute = true, localName = "Code")
    String code;

    @JacksonXmlProperty(isAttribute = true, localName = "Nominal")
    String nominal;

    @JacksonXmlProperty(isAttribute = true, localName = "Name")
    String name;

    @JacksonXmlProperty(isAttribute = true, localName = "Value")
    String value;
}
