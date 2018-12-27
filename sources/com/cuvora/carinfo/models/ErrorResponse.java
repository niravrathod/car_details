package com.cuvora.carinfo.models;

import java.io.Serializable;

public class ErrorResponse implements Response, Serializable {
    private int code;
    private String message;
    private String title;

    public ErrorResponse(int i, String str) {
        this.code = i;
        this.message = str;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
