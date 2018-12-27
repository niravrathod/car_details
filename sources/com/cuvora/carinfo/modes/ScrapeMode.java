package com.cuvora.carinfo.modes;

public enum ScrapeMode {
    WEBVIEW("vaahan"),
    M_PARIVAHAN("mparivaahan"),
    ECHALLAN("echallan");
    
    String name;

    /* renamed from: a */
    public String m6088a() {
        return this.name;
    }

    private ScrapeMode(String str) {
        this.name = str;
    }
}
