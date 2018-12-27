package com.google.gson;

import com.google.gson.internal.C2650e;
import com.google.gson.p142c.C2626a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.gson.a */
final class C4205a extends C2660q<Date> {
    /* renamed from: a */
    private final Class<? extends Date> f17758a;
    /* renamed from: b */
    private final List<DateFormat> f17759b = new ArrayList();

    /* renamed from: b */
    public /* synthetic */ Object mo3332b(JsonReader jsonReader) {
        return m23087a(jsonReader);
    }

    C4205a(Class<? extends Date> cls, String str) {
        this.f17758a = C4205a.m23085a((Class) cls);
        this.f17759b.add(new SimpleDateFormat(str, Locale.US));
        if (Locale.getDefault().equals(Locale.US) == null) {
            this.f17759b.add(new SimpleDateFormat(str));
        }
    }

    public C4205a(Class<? extends Date> cls, int i, int i2) {
        this.f17758a = C4205a.m23085a((Class) cls);
        this.f17759b.add(DateFormat.getDateTimeInstance(i, i2, Locale.US));
        if (Locale.getDefault().equals(Locale.US) == null) {
            this.f17759b.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (C2626a.m12863b() != null) {
            this.f17759b.add(C2650e.m12949a(i, i2));
        }
    }

    /* renamed from: a */
    private static Class<? extends Date> m23085a(Class<? extends Date> cls) {
        if (!(cls == Date.class || cls == java.sql.Date.class)) {
            if (cls != Timestamp.class) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Date type must be one of ");
                stringBuilder.append(Date.class);
                stringBuilder.append(", ");
                stringBuilder.append(Timestamp.class);
                stringBuilder.append(", or ");
                stringBuilder.append(java.sql.Date.class);
                stringBuilder.append(" but was ");
                stringBuilder.append(cls);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        return cls;
    }

    /* renamed from: a */
    public void m23089a(JsonWriter jsonWriter, Date date) {
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this.f17759b) {
            jsonWriter.value(((DateFormat) this.f17759b.get(0)).format(date));
        }
    }

    /* renamed from: a */
    public Date m23087a(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        jsonReader = m23086a(jsonReader.nextString());
        if (this.f17758a == Date.class) {
            return jsonReader;
        }
        if (this.f17758a == Timestamp.class) {
            return new Timestamp(jsonReader.getTime());
        }
        if (this.f17758a == java.sql.Date.class) {
            return new java.sql.Date(jsonReader.getTime());
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    private java.util.Date m23086a(java.lang.String r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r3 = this;
        r0 = r3.f17759b;
        monitor-enter(r0);
        r1 = r3.f17759b;	 Catch:{ all -> 0x002e }
        r1 = r1.iterator();	 Catch:{ all -> 0x002e }
    L_0x0009:
        r2 = r1.hasNext();	 Catch:{ all -> 0x002e }
        if (r2 == 0) goto L_0x001b;	 Catch:{ all -> 0x002e }
    L_0x000f:
        r2 = r1.next();	 Catch:{ all -> 0x002e }
        r2 = (java.text.DateFormat) r2;	 Catch:{ all -> 0x002e }
        r2 = r2.parse(r4);	 Catch:{ ParseException -> 0x0009 }
        monitor-exit(r0);	 Catch:{ all -> 0x002e }
        return r2;
    L_0x001b:
        r1 = new java.text.ParsePosition;	 Catch:{ ParseException -> 0x0027 }
        r2 = 0;	 Catch:{ ParseException -> 0x0027 }
        r1.<init>(r2);	 Catch:{ ParseException -> 0x0027 }
        r1 = com.google.gson.internal.bind.p144a.C2643a.m12941a(r4, r1);	 Catch:{ ParseException -> 0x0027 }
        monitor-exit(r0);	 Catch:{ all -> 0x002e }
        return r1;	 Catch:{ all -> 0x002e }
    L_0x0027:
        r1 = move-exception;	 Catch:{ all -> 0x002e }
        r2 = new com.google.gson.JsonSyntaxException;	 Catch:{ all -> 0x002e }
        r2.<init>(r4, r1);	 Catch:{ all -> 0x002e }
        throw r2;	 Catch:{ all -> 0x002e }
    L_0x002e:
        r4 = move-exception;	 Catch:{ all -> 0x002e }
        monitor-exit(r0);	 Catch:{ all -> 0x002e }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.a.a(java.lang.String):java.util.Date");
    }

    public String toString() {
        DateFormat dateFormat = (DateFormat) this.f17759b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("DefaultDateTypeAdapter(");
            stringBuilder.append(((SimpleDateFormat) dateFormat).toPattern());
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("DefaultDateTypeAdapter(");
        stringBuilder.append(dateFormat.getClass().getSimpleName());
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}
