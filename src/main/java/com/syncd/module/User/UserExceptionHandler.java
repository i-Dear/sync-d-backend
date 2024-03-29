package com.syncd.module.User;

import com.syncd.module.User.exceptions.LoginException;
import com.syncd.module.User.exceptions.RegisterException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class UserExceptionHandler{
    @ExceptionHandler(RegisterException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleRegistrationException(RegisterException ex){
        return ex.getMessage();
    }
    @ExceptionHandler(LoginException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public String handleLoginException(LoginException ex) {
        return ex.getMessage();
    }
}
