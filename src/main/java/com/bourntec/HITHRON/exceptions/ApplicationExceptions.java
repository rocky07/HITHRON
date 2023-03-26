package com.bourntec.HITHRON.exceptions;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ApplicationExceptions {
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
    

  @ResponseStatus(
      value = HttpStatus.BAD_REQUEST,
      reason = "Received Invalid Input Parameters")
    @ExceptionHandler(InputValidationException.class)
    public void handleException(InputValidationException e) {
    }
}
