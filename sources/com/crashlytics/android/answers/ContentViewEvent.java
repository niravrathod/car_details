package com.crashlytics.android.answers;

public class ContentViewEvent extends PredefinedEvent<ContentViewEvent> {
    static final String CONTENT_ID_ATTRIBUTE = "contentId";
    static final String CONTENT_NAME_ATTRIBUTE = "contentName";
    static final String CONTENT_TYPE_ATTRIBUTE = "contentType";
    static final String TYPE = "contentView";

    String getPredefinedType() {
        return TYPE;
    }

    public ContentViewEvent putContentId(String str) {
        this.predefinedAttributes.m5371a(CONTENT_ID_ATTRIBUTE, str);
        return this;
    }

    public ContentViewEvent putContentName(String str) {
        this.predefinedAttributes.m5371a(CONTENT_NAME_ATTRIBUTE, str);
        return this;
    }

    public ContentViewEvent putContentType(String str) {
        this.predefinedAttributes.m5371a(CONTENT_TYPE_ATTRIBUTE, str);
        return this;
    }
}
