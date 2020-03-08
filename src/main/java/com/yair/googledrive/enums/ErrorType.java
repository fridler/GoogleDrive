package com.yair.googledrive.enums;

public enum ErrorType {

    GENERAL_ERROR(600, "General error"),
    NULL_FIELD(601,"This field cannot be NULL"),
    TITLE_ALREADY_EXISTS(602,"Title already exists")
    ;


    private int errorType;
    private String errorMessage;

    ErrorType(int errorType, String errorMessage) {
        this.errorType = errorType;
        this.errorMessage = errorMessage;
    }

    public int getErrorType() {
        return errorType;
    }

    public void setErrorType(int errorType) {
        this.errorType = errorType;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
