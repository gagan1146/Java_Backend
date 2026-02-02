package org.gagan.exceptionhandlingpractice.GlobalExceptions;

import org.gagan.exceptionhandlingpractice.CustomExceptionHandler.CustomException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionExample1 {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ProblemDetail> handleCustomException(CustomException ex) {
        ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(
                HttpStatus.BAD_REQUEST,
                ex.getMessage()
        );
        problemDetail.setTitle("Global Custom Exception Handler");
        problemDetail.setProperty("errorCode", "GLOBAL_CUSTOM_001");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(problemDetail);
    }
}