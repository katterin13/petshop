package com.workshop.petshop.core.entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.workshop.petshop.utils.ErrorType;


public class ApiError {

    private ErrorType errorType;
    private String message;
    private String timestamp;

    public ApiError(ErrorType errorType, String message) {
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.errorType = errorType;
        this.message = message;
        this.timestamp = LocalDateTime.now().format(formatter);
    }

    public ErrorType getErrorType() {
        return errorType;
    }

    public void setErrorType(ErrorType errorType) {
        this.errorType = errorType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

}
