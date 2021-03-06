package com.crashlytics.android.answers;

public class LevelStartEvent extends PredefinedEvent<LevelStartEvent> {
    static final String LEVEL_NAME_ATTRIBUTE = "levelName";
    static final String TYPE = "levelStart";

    String getPredefinedType() {
        return TYPE;
    }

    public LevelStartEvent putLevelName(String str) {
        this.predefinedAttributes.m5371a(LEVEL_NAME_ATTRIBUTE, str);
        return this;
    }
}
