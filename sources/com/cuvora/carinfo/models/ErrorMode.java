package com.cuvora.carinfo.models;

public enum ErrorMode {
    BACKGROUND_WEBVIEW_LOADING_ERROR(1442),
    BACKGROUND_WEBVIEW_MAX_POLLIN_REACHED(1445),
    BACKGROUND_WEBVIEW_NOT_FOUND(1443),
    NO_INTERNET(1444),
    BACKGROUND_WEBVIEW(420),
    SMS_PARSE(422),
    E_CHALLAN(425),
    ERROR_DIALOG(442),
    M_PARIVAHAN(430),
    ERROR_SCREEN(460);
    
    private int value;

    public int getValue() {
        return this.value;
    }

    private ErrorMode(int i) {
        this.value = i;
    }

    public static ErrorMode getErrorModeWithValue(int i) {
        for (ErrorMode errorMode : values()) {
            if (errorMode.value == i) {
                return errorMode;
            }
        }
        return 0;
    }
}
