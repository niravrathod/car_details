package com.crashlytics.android.answers;

public class InviteEvent extends PredefinedEvent<InviteEvent> {
    static final String METHOD_ATTRIBUTE = "method";
    static final String TYPE = "invite";

    String getPredefinedType() {
        return TYPE;
    }

    public InviteEvent putMethod(String str) {
        this.predefinedAttributes.m5371a(METHOD_ATTRIBUTE, str);
        return this;
    }
}
