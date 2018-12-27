package com.cuvora.carinfo.genericScraper;

public enum ResponseType {
    VEHICLE_DETAIL("VEHICLE_DETAIL"),
    SCRAPE("SCRAPE");
    
    String name;

    private ResponseType(String str) {
        this.name = str;
    }

    /* renamed from: a */
    public static ResponseType m5744a(String str) {
        for (ResponseType responseType : values()) {
            if (responseType.name().equalsIgnoreCase(str)) {
                return responseType;
            }
        }
        return VEHICLE_DETAIL;
    }
}
