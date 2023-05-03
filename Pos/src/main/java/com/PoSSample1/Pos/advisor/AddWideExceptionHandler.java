package com.PoSSample1.Pos.advisor;

import com.PoSSample1.Pos.exception.NotFoundException;
import com.PoSSample1.Pos.util.StandardResponse;
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
