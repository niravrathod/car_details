package com.cuvora.carinfo.genericScraper;

import com.cuvora.carinfo.models.Response;
import java.io.Serializable;
import java.util.Map;

public class ScrapeResponse implements Response, Serializable {
    private Map<String, String> body;
    private String clientName;
    private String contentType;
    private Map<String, String> headers;
    private String method;
    private String url;

    /* renamed from: a */
    public String m18501a() {
        return this.method;
    }

    /* renamed from: b */
    public String m18502b() {
        return this.contentType;
    }

    /* renamed from: c */
    public String m18503c() {
        return this.url;
    }

    /* renamed from: d */
    public String m18504d() {
        return this.clientName;
    }

    /* renamed from: e */
    public Map<String, String> m18505e() {
        return this.headers;
    }

    /* renamed from: f */
    public Map<String, String> m18506f() {
        return this.body;
    }
}
