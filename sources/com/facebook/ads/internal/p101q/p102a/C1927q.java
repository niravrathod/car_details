package com.facebook.ads.internal.p101q.p102a;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import org.json.JSONArray;

/* renamed from: com.facebook.ads.internal.q.a.q */
public class C1927q {
    /* renamed from: a */
    public static final String m7305a(Throwable th) {
        if (th == null) {
            return null;
        }
        Writer stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.close();
        return stringWriter.toString();
    }

    /* renamed from: a */
    public static final String m7306a(StackTraceElement[] stackTraceElementArr) {
        JSONArray jSONArray = new JSONArray();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            jSONArray.put(stackTraceElement.toString());
        }
        return jSONArray.toString();
    }
}
