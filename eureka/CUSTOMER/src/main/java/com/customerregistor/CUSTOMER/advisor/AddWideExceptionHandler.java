package com.customerregistor.CUSTOMER.advisor;

import com.customerregistor.CUSTOMER.exception.NotFoundException;
import com.customerregistor.CUSTOMER.util.StandardResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice

public class AddWideExceptionHandler {
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<StandardResponse> HandleNotFoundException(NotFoundException e){
        return new ResponseEntity<StandardResponse>(
                new StandardResponse(404,"Error Eror",e.getMessage()+"Not Get"), HttpStatus.NOT_FOUND
        );


    }
}
