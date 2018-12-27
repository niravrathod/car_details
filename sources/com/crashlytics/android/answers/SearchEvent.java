package com.crashlytics.android.answers;

public class SearchEvent extends PredefinedEvent<SearchEvent> {
    static final String QUERY_ATTRIBUTE = "query";
    static final String TYPE = "search";

    String getPredefinedType() {
        return TYPE;
    }

    public SearchEvent putQuery(String str) {
        this.predefinedAttributes.m5371a(QUERY_ATTRIBUTE, str);
        return this;
    }
}
