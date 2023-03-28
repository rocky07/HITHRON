package com.bourntec.HITHRON.exceptions;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ApplicationExceptions extends ResponseEntityExceptionHandler {
    @ResponseStatus(
      value = HttpStatus.NOT_FOUND,
      reason = "Requested User Not Found")
  @ExceptionHandler(UserNotFoundException.class)
  public void handleException(UserNotFoundException e) {
  }

  @ResponseStatus(
    value = HttpStatus.NOT_FOUND,
    reason = "Requested Item Not Found")
    @ExceptionHandler(NoSuchElementException.class)
    public void handleException(NoSuchElementException e) {
    }

    
    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<Object> handleException(ConstraintViolationException e){
      Map<String, String> errors = new HashMap<>();
      e.getConstraintViolations().forEach((error)->{
            
              String fieldName = error.getMessage();
              String errorMessage = error.getMessage();
              errors.put(fieldName, errorMessage);
          });
        return new ResponseEntity(errors, HttpStatus.BAD_REQUEST);

    }

  @ResponseStatus(
      value = HttpStatus.BAD_REQUEST,
      reason = "Received Invalid Input Parameters")
    @ExceptionHandler(InputValidationException.class)
    public void handleException(InputValidationException e) {
    }
}
