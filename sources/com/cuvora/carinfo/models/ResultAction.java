package com.cuvora.carinfo.models;

public class ResultAction {
    private ResultActionData data;
    private String type;

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public ResultActionData getData() {
        return this.data;
    }

    public void setData(ResultActionData resultActionData) {
        this.data = resultActionData;
    }
}
