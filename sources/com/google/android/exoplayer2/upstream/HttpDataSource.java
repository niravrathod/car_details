package com.google.android.exoplayer2.upstream;

import android.text.TextUtils;
import com.google.android.exoplayer2.p126c.C2177m;
import com.google.android.exoplayer2.p126c.C2186s;
import com.google.android.exoplayer2.upstream.C2368d.C2367a;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface HttpDataSource extends C2368d {
    /* renamed from: a */
    public static final C2177m<String> f16301a = new C40511();

    public static class HttpDataSourceException extends IOException {
        public final C2369e dataSpec;
        public final int type;

        public HttpDataSourceException(String str, C2369e c2369e, int i) {
            super(str);
            this.dataSpec = c2369e;
            this.type = i;
        }

        public HttpDataSourceException(IOException iOException, C2369e c2369e, int i) {
            super(iOException);
            this.dataSpec = c2369e;
            this.type = i;
        }

        public HttpDataSourceException(String str, IOException iOException, C2369e c2369e, int i) {
            super(str, iOException);
            this.dataSpec = c2369e;
            this.type = i;
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.HttpDataSource$c */
    public static final class C2359c {
        /* renamed from: a */
        private final Map<String, String> f7497a = new HashMap();
        /* renamed from: b */
        private Map<String, String> f7498b;

        /* renamed from: a */
        public synchronized Map<String, String> m8667a() {
            if (this.f7498b == null) {
                this.f7498b = Collections.unmodifiableMap(new HashMap(this.f7497a));
            }
            return this.f7498b;
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.HttpDataSource$1 */
    static class C40511 implements C2177m<String> {
        C40511() {
        }

        /* renamed from: a */
        public boolean m20332a(String str) {
            str = C2186s.m8061d(str);
            return (TextUtils.isEmpty(str) || ((str.contains("text") && !str.contains("text/vtt")) || str.contains("html") || str.contains("xml") != null)) ? null : true;
        }
    }

    public static final class InvalidContentTypeException extends HttpDataSourceException {
        public final String contentType;

        public InvalidContentTypeException(String str, C2369e c2369e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid content type: ");
            stringBuilder.append(str);
            super(stringBuilder.toString(), c2369e, 1);
            this.contentType = str;
        }
    }

    public static final class InvalidResponseCodeException extends HttpDataSourceException {
        public final Map<String, List<String>> headerFields;
        public final int responseCode;

        public InvalidResponseCodeException(int i, Map<String, List<String>> map, C2369e c2369e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Response code: ");
            stringBuilder.append(i);
            super(stringBuilder.toString(), c2369e, 1);
            this.responseCode = i;
            this.headerFields = map;
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.HttpDataSource$b */
    public interface C4052b extends C2367a {
    }

    /* renamed from: com.google.android.exoplayer2.upstream.HttpDataSource$a */
    public static abstract class C4696a implements C4052b {
        /* renamed from: a */
        private final C2359c f19478a = new C2359c();

        /* renamed from: b */
        protected abstract HttpDataSource mo4690b(C2359c c2359c);

        /* renamed from: a */
        public /* synthetic */ C2368d mo1698a() {
            return m25912b();
        }

        /* renamed from: b */
        public final HttpDataSource m25912b() {
            return mo4690b(this.f19478a);
        }
    }
}
