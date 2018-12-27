package com.crashlytics.android.answers;

import android.app.Activity;
import java.util.Collections;
import java.util.Map;

final class SessionEvent {
    /* renamed from: a */
    public final C1335u f4160a;
    /* renamed from: b */
    public final long f4161b;
    /* renamed from: c */
    public final Type f4162c;
    /* renamed from: d */
    public final Map<String, String> f4163d;
    /* renamed from: e */
    public final String f4164e;
    /* renamed from: f */
    public final Map<String, Object> f4165f;
    /* renamed from: g */
    public final String f4166g;
    /* renamed from: h */
    public final Map<String, Object> f4167h;
    /* renamed from: i */
    private String f4168i;

    enum Type {
        START,
        RESUME,
        PAUSE,
        STOP,
        CRASH,
        INSTALL,
        CUSTOM,
        PREDEFINED
    }

    /* renamed from: com.crashlytics.android.answers.SessionEvent$a */
    static class C1320a {
        /* renamed from: a */
        final Type f4153a;
        /* renamed from: b */
        final long f4154b = System.currentTimeMillis();
        /* renamed from: c */
        Map<String, String> f4155c = null;
        /* renamed from: d */
        String f4156d = null;
        /* renamed from: e */
        Map<String, Object> f4157e = null;
        /* renamed from: f */
        String f4158f = null;
        /* renamed from: g */
        Map<String, Object> f4159g = null;

        public C1320a(Type type) {
            this.f4153a = type;
        }

        /* renamed from: a */
        public C1320a m5358a(Map<String, String> map) {
            this.f4155c = map;
            return this;
        }

        /* renamed from: a */
        public C1320a m5357a(String str) {
            this.f4156d = str;
            return this;
        }

        /* renamed from: b */
        public C1320a m5361b(Map<String, Object> map) {
            this.f4157e = map;
            return this;
        }

        /* renamed from: b */
        public C1320a m5360b(String str) {
            this.f4158f = str;
            return this;
        }

        /* renamed from: c */
        public C1320a m5362c(Map<String, Object> map) {
            this.f4159g = map;
            return this;
        }

        /* renamed from: a */
        public SessionEvent m5359a(C1335u c1335u) {
            return new SessionEvent(c1335u, this.f4154b, this.f4153a, this.f4155c, this.f4156d, this.f4157e, this.f4158f, this.f4159g);
        }
    }

    /* renamed from: a */
    public static C1320a m5366a(Type type, Activity activity) {
        return new C1320a(type).m5358a(Collections.singletonMap("activity", activity.getClass().getName()));
    }

    /* renamed from: a */
    public static C1320a m5363a(long j) {
        return new C1320a(Type.INSTALL).m5358a(Collections.singletonMap("installedAt", String.valueOf(j)));
    }

    /* renamed from: a */
    public static C1320a m5367a(String str) {
        return new C1320a(Type.CRASH).m5358a(Collections.singletonMap("sessionId", str));
    }

    /* renamed from: a */
    public static C1320a m5368a(String str, String str2) {
        return m5367a(str).m5361b(Collections.singletonMap("exceptionName", str2));
    }

    /* renamed from: a */
    public static C1320a m5364a(CustomEvent customEvent) {
        return new C1320a(Type.CUSTOM).m5357a(customEvent.getCustomType()).m5361b(customEvent.getCustomAttributes());
    }

    /* renamed from: a */
    public static C1320a m5365a(PredefinedEvent<?> predefinedEvent) {
        return new C1320a(Type.PREDEFINED).m5360b(predefinedEvent.getPredefinedType()).m5362c(predefinedEvent.getPredefinedAttributes()).m5361b(predefinedEvent.getCustomAttributes());
    }

    private SessionEvent(C1335u c1335u, long j, Type type, Map<String, String> map, String str, Map<String, Object> map2, String str2, Map<String, Object> map3) {
        this.f4160a = c1335u;
        this.f4161b = j;
        this.f4162c = type;
        this.f4163d = map;
        this.f4164e = str;
        this.f4165f = map2;
        this.f4166g = str2;
        this.f4167h = map3;
    }

    public String toString() {
        if (this.f4168i == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append(getClass().getSimpleName());
            stringBuilder.append(": ");
            stringBuilder.append("timestamp=");
            stringBuilder.append(this.f4161b);
            stringBuilder.append(", type=");
            stringBuilder.append(this.f4162c);
            stringBuilder.append(", details=");
            stringBuilder.append(this.f4163d);
            stringBuilder.append(", customType=");
            stringBuilder.append(this.f4164e);
            stringBuilder.append(", customAttributes=");
            stringBuilder.append(this.f4165f);
            stringBuilder.append(", predefinedType=");
            stringBuilder.append(this.f4166g);
            stringBuilder.append(", predefinedAttributes=");
            stringBuilder.append(this.f4167h);
            stringBuilder.append(", metadata=[");
            stringBuilder.append(this.f4160a);
            stringBuilder.append("]]");
            this.f4168i = stringBuilder.toString();
        }
        return this.f4168i;
    }
}
