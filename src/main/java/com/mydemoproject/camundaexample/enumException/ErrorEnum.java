package com.mydemoproject.camundaexample.enumException;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum ErrorEnum {

    CONNECTION_FAILED(406,"Connection Failed !");

    int errorCode;
    String errorMessage;


}
