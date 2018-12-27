package com.airbnb.lottie.network;

public enum FileExtension {
    Json(".json"),
    Zip(".zip");
    
    public final String extension;

    private FileExtension(String str) {
        this.extension = str;
    }

    /* renamed from: a */
    public String m4304a() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(".temp");
        stringBuilder.append(this.extension);
        return stringBuilder.toString();
    }

    public String toString() {
        return this.extension;
    }
}
