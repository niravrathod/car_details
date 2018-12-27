package com.google.gson.internal.bind;

import com.google.gson.C2660q;
import com.google.gson.C2661r;
import com.google.gson.internal.C2650e;
import com.google.gson.p142c.C2626a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.gson.internal.bind.b */
public final class C4235b extends C2660q<Date> {
    /* renamed from: a */
    public static final C2661r f17863a = new DateTypeAdapter$1();
    /* renamed from: b */
    private final List<DateFormat> f17864b = new ArrayList();

    /* renamed from: b */
    public /* synthetic */ Object mo3332b(JsonReader jsonReader) {
        return m23206a(jsonReader);
    }

    public C4235b() {
        this.f17864b.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.f17864b.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C2626a.m12863b()) {
            this.f17864b.add(C2650e.m12949a(2, 2));
        }
    }

    /* renamed from: a */
    public Date m23206a(JsonReader jsonReader) {
        if (jsonReader.peek() != JsonToken.NULL) {
            return m23205a(jsonReader.nextString());
        }
        jsonReader.nextNull();
        return null;
    }

    /* renamed from: a */
    private synchronized java.util.Date m23205a(java.lang.String r3) {
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
        r2 = this;
        monitor-enter(r2);
        r0 = r2.f17864b;	 Catch:{ all -> 0x002c }
        r0 = r0.iterator();	 Catch:{ all -> 0x002c }
    L_0x0007:
        r1 = r0.hasNext();	 Catch:{ all -> 0x002c }
        if (r1 == 0) goto L_0x0019;	 Catch:{ all -> 0x002c }
    L_0x000d:
        r1 = r0.next();	 Catch:{ all -> 0x002c }
        r1 = (java.text.DateFormat) r1;	 Catch:{ all -> 0x002c }
        r1 = r1.parse(r3);	 Catch:{ ParseException -> 0x0007 }
        monitor-exit(r2);
        return r1;
    L_0x0019:
        r0 = new java.text.ParsePosition;	 Catch:{ ParseException -> 0x0025 }
        r1 = 0;	 Catch:{ ParseException -> 0x0025 }
        r0.<init>(r1);	 Catch:{ ParseException -> 0x0025 }
        r0 = com.google.gson.internal.bind.p144a.C2643a.m12941a(r3, r0);	 Catch:{ ParseException -> 0x0025 }
        monitor-exit(r2);
        return r0;
    L_0x0025:
        r0 = move-exception;
        r1 = new com.google.gson.JsonSyntaxException;	 Catch:{ all -> 0x002c }
        r1.<init>(r3, r0);	 Catch:{ all -> 0x002c }
        throw r1;	 Catch:{ all -> 0x002c }
    L_0x002c:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.b.a(java.lang.String):java.util.Date");
    }

    /* renamed from: a */
    public synchronized void m23208a(JsonWriter jsonWriter, Date date) {
        if (date == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.value(((DateFormat) this.f17864b.get(0)).format(date));
        }
    }
}
