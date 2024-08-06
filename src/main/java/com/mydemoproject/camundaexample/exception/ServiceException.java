package com.mydemoproject.camundaexample.exception;


import com.mydemoproject.camundaexample.enumException.ErrorEnum;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ServiceException extends RuntimeException{

    public ServiceException(int code,String message) {
        super(message);
    }

    public static ServiceException of(ErrorEnum errorEnum) {
        return new ServiceException(
                errorEnum.getErrorCode(),
                errorEnum.getErrorMessage()
        );
    }

}
