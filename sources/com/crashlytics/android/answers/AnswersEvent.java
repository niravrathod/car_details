package com.crashlytics.android.answers;

import io.fabric.sdk.android.C2766c;
import java.util.Map;

public abstract class AnswersEvent<T extends AnswersEvent> {
    public static final int MAX_NUM_ATTRIBUTES = 20;
    public static final int MAX_STRING_LENGTH = 100;
    final C1321a customAttributes = new C1321a(this.validator);
    final C1322b validator = new C1322b(20, 100, C2766c.m13525i());

    Map<String, Object> getCustomAttributes() {
        return this.customAttributes.f4170b;
    }

    public T putCustomAttribute(String str, String str2) {
        this.customAttributes.m5371a(str, str2);
        return this;
    }

    public T putCustomAttribute(String str, Number number) {
        this.customAttributes.m5369a(str, number);
        return this;
    }
}
