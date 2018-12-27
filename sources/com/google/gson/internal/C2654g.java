package com.google.gson.internal;

import com.google.gson.C2657k;
import com.google.gson.internal.bind.C2647i;
import com.google.gson.stream.JsonWriter;
import java.io.Writer;

/* renamed from: com.google.gson.internal.g */
public final class C2654g {

    /* renamed from: com.google.gson.internal.g$a */
    private static final class C2653a extends Writer {
        /* renamed from: a */
        private final Appendable f11223a;
        /* renamed from: b */
        private final C2652a f11224b = new C2652a();

        /* renamed from: com.google.gson.internal.g$a$a */
        static class C2652a implements CharSequence {
            /* renamed from: a */
            char[] f11222a;

            C2652a() {
            }

            public int length() {
                return this.f11222a.length;
            }

            public char charAt(int i) {
                return this.f11222a[i];
            }

            public CharSequence subSequence(int i, int i2) {
                return new String(this.f11222a, i, i2 - i);
            }
        }

        public void close() {
        }

        public void flush() {
        }

        C2653a(Appendable appendable) {
            this.f11223a = appendable;
        }

        public void write(char[] cArr, int i, int i2) {
            this.f11224b.f11222a = cArr;
            this.f11223a.append(this.f11224b, i, i2 + i);
        }

        public void write(int i) {
            this.f11223a.append((char) i);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static com.google.gson.C2657k m12954a(com.google.gson.stream.JsonReader r2) {
        /*
        r2.peek();	 Catch:{ EOFException -> 0x0024, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
        r0 = 0;
        r1 = com.google.gson.internal.bind.C2647i.f11191X;	 Catch:{ EOFException -> 0x000d, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
        r2 = r1.mo3332b(r2);	 Catch:{ EOFException -> 0x000d, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
        r2 = (com.google.gson.C2657k) r2;	 Catch:{ EOFException -> 0x000d, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
        return r2;
    L_0x000d:
        r2 = move-exception;
        goto L_0x0026;
    L_0x000f:
        r2 = move-exception;
        r0 = new com.google.gson.JsonSyntaxException;
        r0.<init>(r2);
        throw r0;
    L_0x0016:
        r2 = move-exception;
        r0 = new com.google.gson.JsonIOException;
        r0.<init>(r2);
        throw r0;
    L_0x001d:
        r2 = move-exception;
        r0 = new com.google.gson.JsonSyntaxException;
        r0.<init>(r2);
        throw r0;
    L_0x0024:
        r2 = move-exception;
        r0 = 1;
    L_0x0026:
        if (r0 == 0) goto L_0x002b;
    L_0x0028:
        r2 = com.google.gson.C4256l.f17892a;
        return r2;
    L_0x002b:
        r0 = new com.google.gson.JsonSyntaxException;
        r0.<init>(r2);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.g.a(com.google.gson.stream.JsonReader):com.google.gson.k");
    }

    /* renamed from: a */
    public static void m12956a(C2657k c2657k, JsonWriter jsonWriter) {
        C2647i.f11191X.mo3331a(jsonWriter, c2657k);
    }

    /* renamed from: a */
    public static Writer m12955a(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new C2653a(appendable);
    }
}
