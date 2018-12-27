package com.crashlytics.android.answers;

public class CustomEvent extends AnswersEvent<CustomEvent> {
    private final String eventName;

    public CustomEvent(String str) {
        if (str != null) {
            this.eventName = this.validator.m5373a(str);
            return;
        }
        throw new NullPointerException("eventName must not be null");
    }

    String getCustomType() {
        return this.eventName;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{eventName:\"");
        stringBuilder.append(this.eventName);
        stringBuilder.append('\"');
        stringBuilder.append(", customAttributes:");
        stringBuilder.append(this.customAttributes);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
