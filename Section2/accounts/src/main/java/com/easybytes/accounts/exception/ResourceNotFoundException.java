package com.easybytes.accounts.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    /**
     * And to this constructor this time I'm not going to pass a one parameter.
     * I'm going to pass multiple parameters to throw a detail exception to my end user or to the client application.
     * The problem is this runtime exception constructor. It is going to accept only a single string as an input parameter.
     * we need to prepare a single string value, so we can use String.format("gbn %s vv %s: %s", , ,)
     * @param resourceName: for example accounts or customer
     * @param fieldName
     * @param fieldValue
     */
    public ResourceNotFoundException(String resourceName, String fieldName, String fieldValue) {
        super("%s not found with the given input data %s:'%s'".formatted(resourceName, fieldName, fieldValue));
        //super(String.format("%s not found with the given input data %s:'%s'", resourceName, fieldName, fieldValue);
    }
}
