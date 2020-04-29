package com.example.feignclient.errors;

import feign.FeignException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolationException;
import java.io.IOException;

@ControllerAdvice
public class FeignClientExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(FeignClientExceptionHandler.class);

    @ExceptionHandler(FeignException.class)
    public void feignException(final HttpServletResponse response, final FeignException exception) throws IOException {
        LOGGER.warn("Got exception while calling feign server", exception);
        response.sendError(exception.status());
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public void constraintViolationException(final HttpServletResponse response, final ConstraintViolationException exception) throws IOException {
        LOGGER.warn("Constraint violation", exception);
        response.sendError(HttpStatus.BAD_REQUEST.value());
    }
}
