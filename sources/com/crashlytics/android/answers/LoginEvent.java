package com.crashlytics.android.answers;

public class LoginEvent extends PredefinedEvent<LoginEvent> {
    static final String METHOD_ATTRIBUTE = "method";
    static final String SUCCESS_ATTRIBUTE = "success";
    static final String TYPE = "login";

    String getPredefinedType() {
        return TYPE;
    }

    public LoginEvent putMethod(String str) {
        this.predefinedAttributes.m5371a(METHOD_ATTRIBUTE, str);
        return this;
    }

    public LoginEvent putSuccess(boolean z) {
        this.predefinedAttributes.m5371a(SUCCESS_ATTRIBUTE, Boolean.toString(z));
        return this;
    }
}
