package okhttp3;

import java.io.IOException;

public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    QUIC("quic");
    
    private final String protocol;

    private Protocol(String str) {
        this.protocol = str;
    }

    /* renamed from: a */
    public static Protocol m13976a(String str) {
        if (str.equals(HTTP_1_0.protocol)) {
            return HTTP_1_0;
        }
        if (str.equals(HTTP_1_1.protocol)) {
            return HTTP_1_1;
        }
        if (str.equals(HTTP_2.protocol)) {
            return HTTP_2;
        }
        if (str.equals(SPDY_3.protocol)) {
            return SPDY_3;
        }
        if (str.equals(QUIC.protocol)) {
            return QUIC;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected protocol: ");
        stringBuilder.append(str);
        throw new IOException(stringBuilder.toString());
    }

    public String toString() {
        return this.protocol;
    }
}
