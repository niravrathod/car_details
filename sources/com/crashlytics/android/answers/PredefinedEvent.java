package com.crashlytics.android.answers;

import java.util.Map;

public abstract class PredefinedEvent<T extends PredefinedEvent> extends AnswersEvent<T> {
    final C1321a predefinedAttributes = new C1321a(this.validator);

    abstract String getPredefinedType();

    Map<String, Object> getPredefinedAttributes() {
        return this.predefinedAttributes.f4170b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{type:\"");
        stringBuilder.append(getPredefinedType());
        stringBuilder.append('\"');
        stringBuilder.append(", predefinedAttributes:");
        stringBuilder.append(this.predefinedAttributes);
        stringBuilder.append(", customAttributes:");
        stringBuilder.append(this.customAttributes);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
