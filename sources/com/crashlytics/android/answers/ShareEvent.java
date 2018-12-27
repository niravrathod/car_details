package com.crashlytics.android.answers;

public class ShareEvent extends PredefinedEvent<ShareEvent> {
    static final String CONTENT_ID_ATTRIBUTE = "contentId";
    static final String CONTENT_NAME_ATTRIBUTE = "contentName";
    static final String CONTENT_TYPE_ATTRIBUTE = "contentType";
    static final String METHOD_ATTRIBUTE = "method";
    static final String TYPE = "share";

    String getPredefinedType() {
        return TYPE;
    }

    public ShareEvent putMethod(String str) {
        this.predefinedAttributes.m5371a(METHOD_ATTRIBUTE, str);
        return this;
    }

    public ShareEvent putContentId(String str) {
        this.predefinedAttributes.m5371a(CONTENT_ID_ATTRIBUTE, str);
        return this;
    }

    public ShareEvent putContentName(String str) {
        this.predefinedAttributes.m5371a(CONTENT_NAME_ATTRIBUTE, str);
        return this;
    }

    public ShareEvent putContentType(String str) {
        this.predefinedAttributes.m5371a(CONTENT_TYPE_ATTRIBUTE, str);
        return this;
    }
}
