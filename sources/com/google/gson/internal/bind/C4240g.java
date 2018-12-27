package com.google.gson.internal.bind;

import com.google.gson.C2660q;
import com.google.gson.C2661r;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/* renamed from: com.google.gson.internal.bind.g */
public final class C4240g extends C2660q<Time> {
    /* renamed from: a */
    public static final C2661r f17880a = new TimeTypeAdapter$1();
    /* renamed from: b */
    private final DateFormat f17881b = new SimpleDateFormat("hh:mm:ss a");

    /* renamed from: b */
    public /* synthetic */ Object mo3332b(JsonReader jsonReader) {
        return m23225a(jsonReader);
    }

    /* renamed from: a */
    public synchronized Time m23225a(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        try {
            return new Time(this.f17881b.parse(jsonReader.nextString()).getTime());
        } catch (Throwable e) {
            throw new JsonSyntaxException(e);
        }
    }

    /* renamed from: a */
    public synchronized void m23227a(JsonWriter jsonWriter, Time time) {
        jsonWriter.value(time == null ? null : this.f17881b.format(time));
    }
}
