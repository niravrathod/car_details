package com.crashlytics.android.answers;

public class LevelEndEvent extends PredefinedEvent<LevelEndEvent> {
    static final String LEVEL_NAME_ATTRIBUTE = "levelName";
    static final String SCORE_ATTRIBUTE = "score";
    static final String SUCCESS_ATTRIBUTE = "success";
    static final String TYPE = "levelEnd";

    String getPredefinedType() {
        return TYPE;
    }

    public LevelEndEvent putLevelName(String str) {
        this.predefinedAttributes.m5371a(LEVEL_NAME_ATTRIBUTE, str);
        return this;
    }

    public LevelEndEvent putScore(Number number) {
        this.predefinedAttributes.m5369a(SCORE_ATTRIBUTE, number);
        return this;
    }

    public LevelEndEvent putSuccess(boolean z) {
        this.predefinedAttributes.m5371a(SUCCESS_ATTRIBUTE, z ? "true" : "false");
        return this;
    }
}
