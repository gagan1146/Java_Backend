package org.gagan.exceptionhandlingpractice.CustomExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/custom-error")
public class Example1 {

    @GetMapping("/fetch-data-first")
    public ResponseEntity<?> getData() {
        throw new CustomException("Something went wrong while fetching data from first!");
    }
   @GetMapping("/fetch-data-second")
    public ResponseEntity<?> getData1() {
        throw new CustomException("Something went wrong while fetching data from second!");
    }

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ErrorResponse> customExceptionHandler(CustomException ex) {
        ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(
                HttpStatus.BAD_REQUEST,
                ex.getMessage()
        );
        problemDetail.setTitle("Custom Exception Occurred");
        problemDetail.setProperty("errorCode", "CUSTOM_001");

        ErrorResponse errorResponse = new ErrorResponse() {
            @Override
            public HttpStatusCode getStatusCode() {
                return HttpStatus.BAD_REQUEST;
            }

            @Override
            public ProblemDetail getBody() {
                return problemDetail;
            }
        };
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }
@ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> customExceptionHandler1(IllegalArgumentException ex) {
        return new ResponseEntity<>(ex.getMessage(),HttpStatus.BAD_REQUEST);
    }
}