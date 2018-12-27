package com.google.gson.internal.bind;

import com.google.gson.C2660q;
import com.google.gson.C2661r;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/* renamed from: com.google.gson.internal.bind.f */
public final class C4239f extends C2660q<Date> {
    /* renamed from: a */
    public static final C2661r f17878a = new SqlDateTypeAdapter$1();
    /* renamed from: b */
    private final DateFormat f17879b = new SimpleDateFormat("MMM d, yyyy");

    /* renamed from: b */
    public /* synthetic */ Object mo3332b(JsonReader jsonReader) {
        return m23221a(jsonReader);
    }

    /* renamed from: a */
    public synchronized Date m23221a(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        try {
            return new Date(this.f17879b.parse(jsonReader.nextString()).getTime());
        } catch (Throwable e) {
            throw new JsonSyntaxException(e);
        }
    }

    /* renamed from: a */
    public synchronized void m23223a(JsonWriter jsonWriter, Date date) {
        jsonWriter.value(date == null ? null : this.f17879b.format(date));
    }
}
