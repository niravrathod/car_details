package com.google.gson.internal.bind;

import com.google.gson.C2657k;
import com.google.gson.C2660q;
import com.google.gson.C2661r;
import com.google.gson.C4212h;
import com.google.gson.C4256l;
import com.google.gson.C4257m;
import com.google.gson.C4258n;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.bind.i.AnonymousClass23;
import com.google.gson.p140a.C2621c;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* renamed from: com.google.gson.internal.bind.i */
public final class C2647i {
    /* renamed from: A */
    public static final C2660q<String> f11168A = new C42498();
    /* renamed from: B */
    public static final C2660q<BigDecimal> f11169B = new C42509();
    /* renamed from: C */
    public static final C2660q<BigInteger> f11170C = new C2660q<BigInteger>() {
        /* renamed from: b */
        public /* synthetic */ Object mo3332b(JsonReader jsonReader) {
            return m23232a(jsonReader);
        }

        /* renamed from: a */
        public BigInteger m23232a(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return new BigInteger(jsonReader.nextString());
            } catch (Throwable e) {
                throw new JsonSyntaxException(e);
            }
        }

        /* renamed from: a */
        public void m23234a(JsonWriter jsonWriter, BigInteger bigInteger) {
            jsonWriter.value((Number) bigInteger);
        }
    };
    /* renamed from: D */
    public static final C2661r f11171D = C2647i.m12943a(String.class, f11168A);
    /* renamed from: E */
    public static final C2660q<StringBuilder> f11172E = new C2660q<StringBuilder>() {
        /* renamed from: b */
        public /* synthetic */ Object mo3332b(JsonReader jsonReader) {
            return m23236a(jsonReader);
        }

        /* renamed from: a */
        public StringBuilder m23236a(JsonReader jsonReader) {
            if (jsonReader.peek() != JsonToken.NULL) {
                return new StringBuilder(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: a */
        public void m23238a(JsonWriter jsonWriter, StringBuilder stringBuilder) {
            jsonWriter.value(stringBuilder == null ? null : stringBuilder.toString());
        }
    };
    /* renamed from: F */
    public static final C2661r f11173F = C2647i.m12943a(StringBuilder.class, f11172E);
    /* renamed from: G */
    public static final C2660q<StringBuffer> f11174G = new C2660q<StringBuffer>() {
        /* renamed from: b */
        public /* synthetic */ Object mo3332b(JsonReader jsonReader) {
            return m23244a(jsonReader);
        }

        /* renamed from: a */
        public StringBuffer m23244a(JsonReader jsonReader) {
            if (jsonReader.peek() != JsonToken.NULL) {
                return new StringBuffer(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: a */
        public void m23246a(JsonWriter jsonWriter, StringBuffer stringBuffer) {
            jsonWriter.value(stringBuffer == null ? null : stringBuffer.toString());
        }
    };
    /* renamed from: H */
    public static final C2661r f11175H = C2647i.m12943a(StringBuffer.class, f11174G);
    /* renamed from: I */
    public static final C2660q<URL> f11176I = new C2660q<URL>() {
        /* renamed from: b */
        public /* synthetic */ Object mo3332b(JsonReader jsonReader) {
            return m23248a(jsonReader);
        }

        /* renamed from: a */
        public URL m23248a(JsonReader jsonReader) {
            URL url = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader = jsonReader.nextString();
            if (!"null".equals(jsonReader)) {
                url = new URL(jsonReader);
            }
            return url;
        }

        /* renamed from: a */
        public void m23250a(JsonWriter jsonWriter, URL url) {
            jsonWriter.value(url == null ? null : url.toExternalForm());
        }
    };
    /* renamed from: J */
    public static final C2661r f11177J = C2647i.m12943a(URL.class, f11176I);
    /* renamed from: K */
    public static final C2660q<URI> f11178K = new C2660q<URI>() {
        /* renamed from: b */
        public /* synthetic */ Object mo3332b(JsonReader jsonReader) {
            return m23252a(jsonReader);
        }

        /* renamed from: a */
        public URI m23252a(JsonReader jsonReader) {
            URI uri = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                jsonReader = jsonReader.nextString();
                if (!"null".equals(jsonReader)) {
                    uri = new URI(jsonReader);
                }
                return uri;
            } catch (Throwable e) {
                throw new JsonIOException(e);
            }
        }

        /* renamed from: a */
        public void m23254a(JsonWriter jsonWriter, URI uri) {
            jsonWriter.value(uri == null ? null : uri.toASCIIString());
        }
    };
    /* renamed from: L */
    public static final C2661r f11179L = C2647i.m12943a(URI.class, f11178K);
    /* renamed from: M */
    public static final C2660q<InetAddress> f11180M = new C2660q<InetAddress>() {
        /* renamed from: b */
        public /* synthetic */ Object mo3332b(JsonReader jsonReader) {
            return m23256a(jsonReader);
        }

        /* renamed from: a */
        public InetAddress m23256a(JsonReader jsonReader) {
            if (jsonReader.peek() != JsonToken.NULL) {
                return InetAddress.getByName(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: a */
        public void m23258a(JsonWriter jsonWriter, InetAddress inetAddress) {
            jsonWriter.value(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    };
    /* renamed from: N */
    public static final C2661r f11181N = C2647i.m12945b(InetAddress.class, f11180M);
    /* renamed from: O */
    public static final C2660q<UUID> f11182O = new C2660q<UUID>() {
        /* renamed from: b */
        public /* synthetic */ Object mo3332b(JsonReader jsonReader) {
            return m23260a(jsonReader);
        }

        /* renamed from: a */
        public UUID m23260a(JsonReader jsonReader) {
            if (jsonReader.peek() != JsonToken.NULL) {
                return UUID.fromString(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: a */
        public void m23262a(JsonWriter jsonWriter, UUID uuid) {
            jsonWriter.value(uuid == null ? null : uuid.toString());
        }
    };
    /* renamed from: P */
    public static final C2661r f11183P = C2647i.m12943a(UUID.class, f11182O);
    /* renamed from: Q */
    public static final C2660q<Currency> f11184Q = new C2660q<Currency>() {
        /* renamed from: b */
        public /* synthetic */ Object mo3332b(JsonReader jsonReader) {
            return m23264a(jsonReader);
        }

        /* renamed from: a */
        public Currency m23264a(JsonReader jsonReader) {
            return Currency.getInstance(jsonReader.nextString());
        }

        /* renamed from: a */
        public void m23266a(JsonWriter jsonWriter, Currency currency) {
            jsonWriter.value(currency.getCurrencyCode());
        }
    }.m12977a();
    /* renamed from: R */
    public static final C2661r f11185R = C2647i.m12943a(Currency.class, f11184Q);
    /* renamed from: S */
    public static final C2661r f11186S = new TypeAdapters$26();
    /* renamed from: T */
    public static final C2660q<Calendar> f11187T = new C2660q<Calendar>() {
        /* renamed from: b */
        public /* synthetic */ Object mo3332b(JsonReader jsonReader) {
            return m23268a(jsonReader);
        }

        /* renamed from: a */
        public Calendar m23268a(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (jsonReader.peek() != JsonToken.END_OBJECT) {
                String nextName = jsonReader.nextName();
                int nextInt = jsonReader.nextInt();
                if ("year".equals(nextName)) {
                    i = nextInt;
                } else if ("month".equals(nextName)) {
                    i2 = nextInt;
                } else if ("dayOfMonth".equals(nextName)) {
                    i3 = nextInt;
                } else if ("hourOfDay".equals(nextName)) {
                    i4 = nextInt;
                } else if ("minute".equals(nextName)) {
                    i5 = nextInt;
                } else if ("second".equals(nextName)) {
                    i6 = nextInt;
                }
            }
            jsonReader.endObject();
            return new GregorianCalendar(i, i2, i3, i4, i5, i6);
        }

        /* renamed from: a */
        public void m23270a(JsonWriter jsonWriter, Calendar calendar) {
            if (calendar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("year");
            jsonWriter.value((long) calendar.get(1));
            jsonWriter.name("month");
            jsonWriter.value((long) calendar.get(2));
            jsonWriter.name("dayOfMonth");
            jsonWriter.value((long) calendar.get(5));
            jsonWriter.name("hourOfDay");
            jsonWriter.value((long) calendar.get(11));
            jsonWriter.name("minute");
            jsonWriter.value((long) calendar.get(12));
            jsonWriter.name("second");
            jsonWriter.value((long) calendar.get(13));
            jsonWriter.endObject();
        }
    };
    /* renamed from: U */
    public static final C2661r f11188U = C2647i.m12946b(Calendar.class, GregorianCalendar.class, f11187T);
    /* renamed from: V */
    public static final C2660q<Locale> f11189V = new C2660q<Locale>() {
        /* renamed from: b */
        public /* synthetic */ Object mo3332b(JsonReader jsonReader) {
            return m23276a(jsonReader);
        }

        /* renamed from: a */
        public Locale m23276a(JsonReader jsonReader) {
            String str = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(jsonReader.nextString(), "_");
            jsonReader = stringTokenizer.hasMoreElements() != null ? stringTokenizer.nextToken() : null;
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            }
            if (nextToken == null && str == null) {
                return new Locale(jsonReader);
            }
            if (str == null) {
                return new Locale(jsonReader, nextToken);
            }
            return new Locale(jsonReader, nextToken, str);
        }

        /* renamed from: a */
        public void m23278a(JsonWriter jsonWriter, Locale locale) {
            jsonWriter.value(locale == null ? null : locale.toString());
        }
    };
    /* renamed from: W */
    public static final C2661r f11190W = C2647i.m12943a(Locale.class, f11189V);
    /* renamed from: X */
    public static final C2660q<C2657k> f11191X = new C2660q<C2657k>() {
        /* renamed from: b */
        public /* synthetic */ Object mo3332b(JsonReader jsonReader) {
            return m23280a(jsonReader);
        }

        /* renamed from: a */
        public C2657k m23280a(JsonReader jsonReader) {
            C2657k c4212h;
            switch (jsonReader.peek()) {
                case NUMBER:
                    return new C4258n(new LazilyParsedNumber(jsonReader.nextString()));
                case BOOLEAN:
                    return new C4258n(Boolean.valueOf(jsonReader.nextBoolean()));
                case STRING:
                    return new C4258n(jsonReader.nextString());
                case NULL:
                    jsonReader.nextNull();
                    return C4256l.f17892a;
                case BEGIN_ARRAY:
                    c4212h = new C4212h();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        c4212h.m23115a(m23280a(jsonReader));
                    }
                    jsonReader.endArray();
                    return c4212h;
                case BEGIN_OBJECT:
                    c4212h = new C4257m();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        c4212h.m23353a(jsonReader.nextName(), m23280a(jsonReader));
                    }
                    jsonReader.endObject();
                    return c4212h;
                default:
                    throw new IllegalArgumentException();
            }
        }

        /* renamed from: a */
        public void m23281a(JsonWriter jsonWriter, C2657k c2657k) {
            if (c2657k != null) {
                if (!c2657k.m12970j()) {
                    if (c2657k.m12969i()) {
                        c2657k = c2657k.m12973m();
                        if (c2657k.m23367p()) {
                            jsonWriter.value(c2657k.mo3333a());
                            return;
                        } else if (c2657k.m23366o()) {
                            jsonWriter.value(c2657k.mo3338f());
                            return;
                        } else {
                            jsonWriter.value(c2657k.mo3334b());
                            return;
                        }
                    } else if (c2657k.m12967g()) {
                        jsonWriter.beginArray();
                        c2657k = c2657k.m12972l().iterator();
                        while (c2657k.hasNext()) {
                            m23281a(jsonWriter, (C2657k) c2657k.next());
                        }
                        jsonWriter.endArray();
                        return;
                    } else if (c2657k.m12968h()) {
                        jsonWriter.beginObject();
                        for (Entry entry : c2657k.m12971k().m23355o()) {
                            jsonWriter.name((String) entry.getKey());
                            m23281a(jsonWriter, (C2657k) entry.getValue());
                        }
                        jsonWriter.endObject();
                        return;
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Couldn't write ");
                        stringBuilder.append(c2657k.getClass());
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
            }
            jsonWriter.nullValue();
        }
    };
    /* renamed from: Y */
    public static final C2661r f11192Y = C2647i.m12945b(C2657k.class, f11191X);
    /* renamed from: Z */
    public static final C2661r f11193Z = new TypeAdapters$30();
    /* renamed from: a */
    public static final C2660q<Class> f11194a = new C42421().m12977a();
    /* renamed from: b */
    public static final C2661r f11195b = C2647i.m12943a(Class.class, f11194a);
    /* renamed from: c */
    public static final C2660q<BitSet> f11196c = new C2660q<BitSet>() {
        /* renamed from: b */
        public /* synthetic */ Object mo3332b(JsonReader jsonReader) {
            return m23240a(jsonReader);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        public java.util.BitSet m23240a(com.google.gson.stream.JsonReader r7) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r6 = this;
            r0 = new java.util.BitSet;
            r0.<init>();
            r7.beginArray();
            r1 = r7.peek();
            r2 = 0;
            r3 = 0;
        L_0x000e:
            r4 = com.google.gson.stream.JsonToken.END_ARRAY;
            if (r1 == r4) goto L_0x0070;
        L_0x0012:
            r4 = com.google.gson.internal.bind.i.AnonymousClass23.f11167a;
            r5 = r1.ordinal();
            r4 = r4[r5];
            r5 = 1;
            switch(r4) {
                case 1: goto L_0x005e;
                case 2: goto L_0x0059;
                case 3: goto L_0x0035;
                default: goto L_0x001e;
            };
        L_0x001e:
            r7 = new com.google.gson.JsonSyntaxException;
            r0 = new java.lang.StringBuilder;
            r0.<init>();
            r2 = "Invalid bitset value type: ";
            r0.append(r2);
            r0.append(r1);
            r0 = r0.toString();
            r7.<init>(r0);
            throw r7;
        L_0x0035:
            r1 = r7.nextString();
            r4 = java.lang.Integer.parseInt(r1);	 Catch:{ NumberFormatException -> 0x0042 }
            if (r4 == 0) goto L_0x0040;
        L_0x003f:
            goto L_0x0064;
        L_0x0040:
            r5 = 0;
            goto L_0x0064;
        L_0x0042:
            r7 = new com.google.gson.JsonSyntaxException;
            r0 = new java.lang.StringBuilder;
            r0.<init>();
            r2 = "Error: Expecting: bitset number value (1, 0), Found: ";
            r0.append(r2);
            r0.append(r1);
            r0 = r0.toString();
            r7.<init>(r0);
            throw r7;
        L_0x0059:
            r5 = r7.nextBoolean();
            goto L_0x0064;
        L_0x005e:
            r1 = r7.nextInt();
            if (r1 == 0) goto L_0x0040;
        L_0x0064:
            if (r5 == 0) goto L_0x0069;
        L_0x0066:
            r0.set(r3);
        L_0x0069:
            r3 = r3 + 1;
            r1 = r7.peek();
            goto L_0x000e;
        L_0x0070:
            r7.endArray();
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.i.12.a(com.google.gson.stream.JsonReader):java.util.BitSet");
        }

        /* renamed from: a */
        public void m23242a(JsonWriter jsonWriter, BitSet bitSet) {
            jsonWriter.beginArray();
            int length = bitSet.length();
            for (int i = 0; i < length; i++) {
                jsonWriter.value((long) bitSet.get(i));
            }
            jsonWriter.endArray();
        }
    }.m12977a();
    /* renamed from: d */
    public static final C2661r f11197d = C2647i.m12943a(BitSet.class, f11196c);
    /* renamed from: e */
    public static final C2660q<Boolean> f11198e = new C2660q<Boolean>() {
        /* renamed from: b */
        public /* synthetic */ Object mo3332b(JsonReader jsonReader) {
            return m23284a(jsonReader);
        }

        /* renamed from: a */
        public Boolean m23284a(JsonReader jsonReader) {
            JsonToken peek = jsonReader.peek();
            if (peek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            } else if (peek == JsonToken.STRING) {
                return Boolean.valueOf(Boolean.parseBoolean(jsonReader.nextString()));
            } else {
                return Boolean.valueOf(jsonReader.nextBoolean());
            }
        }

        /* renamed from: a */
        public void m23285a(JsonWriter jsonWriter, Boolean bool) {
            jsonWriter.value(bool);
        }
    };
    /* renamed from: f */
    public static final C2660q<Boolean> f11199f = new C2660q<Boolean>() {
        /* renamed from: b */
        public /* synthetic */ Object mo3332b(JsonReader jsonReader) {
            return m23288a(jsonReader);
        }

        /* renamed from: a */
        public Boolean m23288a(JsonReader jsonReader) {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Boolean.valueOf(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: a */
        public void m23289a(JsonWriter jsonWriter, Boolean bool) {
            jsonWriter.value(bool == null ? "null" : bool.toString());
        }
    };
    /* renamed from: g */
    public static final C2661r f11200g = C2647i.m12944a(Boolean.TYPE, Boolean.class, f11198e);
    /* renamed from: h */
    public static final C2660q<Number> f11201h = new C2660q<Number>() {
        /* renamed from: b */
        public /* synthetic */ Object mo3332b(JsonReader jsonReader) {
            return m23292a(jsonReader);
        }

        /* renamed from: a */
        public Number m23292a(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Byte.valueOf((byte) jsonReader.nextInt());
            } catch (Throwable e) {
                throw new JsonSyntaxException(e);
            }
        }

        /* renamed from: a */
        public void m23293a(JsonWriter jsonWriter, Number number) {
            jsonWriter.value(number);
        }
    };
    /* renamed from: i */
    public static final C2661r f11202i = C2647i.m12944a(Byte.TYPE, Byte.class, f11201h);
    /* renamed from: j */
    public static final C2660q<Number> f11203j = new C2660q<Number>() {
        /* renamed from: b */
        public /* synthetic */ Object mo3332b(JsonReader jsonReader) {
            return m23296a(jsonReader);
        }

        /* renamed from: a */
        public Number m23296a(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Short.valueOf((short) jsonReader.nextInt());
            } catch (Throwable e) {
                throw new JsonSyntaxException(e);
            }
        }

        /* renamed from: a */
        public void m23297a(JsonWriter jsonWriter, Number number) {
            jsonWriter.value(number);
        }
    };
    /* renamed from: k */
    public static final C2661r f11204k = C2647i.m12944a(Short.TYPE, Short.class, f11203j);
    /* renamed from: l */
    public static final C2660q<Number> f11205l = new C2660q<Number>() {
        /* renamed from: b */
        public /* synthetic */ Object mo3332b(JsonReader jsonReader) {
            return m23300a(jsonReader);
        }

        /* renamed from: a */
        public Number m23300a(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Integer.valueOf(jsonReader.nextInt());
            } catch (Throwable e) {
                throw new JsonSyntaxException(e);
            }
        }

        /* renamed from: a */
        public void m23301a(JsonWriter jsonWriter, Number number) {
            jsonWriter.value(number);
        }
    };
    /* renamed from: m */
    public static final C2661r f11206m = C2647i.m12944a(Integer.TYPE, Integer.class, f11205l);
    /* renamed from: n */
    public static final C2660q<AtomicInteger> f11207n = new C2660q<AtomicInteger>() {
        /* renamed from: b */
        public /* synthetic */ Object mo3332b(JsonReader jsonReader) {
            return m23304a(jsonReader);
        }

        /* renamed from: a */
        public AtomicInteger m23304a(JsonReader jsonReader) {
            try {
                return new AtomicInteger(jsonReader.nextInt());
            } catch (Throwable e) {
                throw new JsonSyntaxException(e);
            }
        }

        /* renamed from: a */
        public void m23306a(JsonWriter jsonWriter, AtomicInteger atomicInteger) {
            jsonWriter.value((long) atomicInteger.get());
        }
    }.m12977a();
    /* renamed from: o */
    public static final C2661r f11208o = C2647i.m12943a(AtomicInteger.class, f11207n);
    /* renamed from: p */
    public static final C2660q<AtomicBoolean> f11209p = new C2660q<AtomicBoolean>() {
        /* renamed from: b */
        public /* synthetic */ Object mo3332b(JsonReader jsonReader) {
            return m23308a(jsonReader);
        }

        /* renamed from: a */
        public AtomicBoolean m23308a(JsonReader jsonReader) {
            return new AtomicBoolean(jsonReader.nextBoolean());
        }

        /* renamed from: a */
        public void m23310a(JsonWriter jsonWriter, AtomicBoolean atomicBoolean) {
            jsonWriter.value(atomicBoolean.get());
        }
    }.m12977a();
    /* renamed from: q */
    public static final C2661r f11210q = C2647i.m12943a(AtomicBoolean.class, f11209p);
    /* renamed from: r */
    public static final C2660q<AtomicIntegerArray> f11211r = new C42432().m12977a();
    /* renamed from: s */
    public static final C2661r f11212s = C2647i.m12943a(AtomicIntegerArray.class, f11211r);
    /* renamed from: t */
    public static final C2660q<Number> f11213t = new C42443();
    /* renamed from: u */
    public static final C2660q<Number> f11214u = new C42454();
    /* renamed from: v */
    public static final C2660q<Number> f11215v = new C42465();
    /* renamed from: w */
    public static final C2660q<Number> f11216w = new C42476();
    /* renamed from: x */
    public static final C2661r f11217x = C2647i.m12943a(Number.class, f11216w);
    /* renamed from: y */
    public static final C2660q<Character> f11218y = new C42487();
    /* renamed from: z */
    public static final C2661r f11219z = C2647i.m12944a(Character.TYPE, Character.class, f11218y);

    /* renamed from: com.google.gson.internal.bind.i$1 */
    static class C42421 extends C2660q<Class> {
        C42421() {
        }

        /* renamed from: b */
        public /* synthetic */ Object mo3332b(JsonReader jsonReader) {
            return m23272a(jsonReader);
        }

        /* renamed from: a */
        public void m23273a(JsonWriter jsonWriter, Class cls) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Attempted to serialize java.lang.Class: ");
            stringBuilder.append(cls.getName());
            stringBuilder.append(". Forgot to register a type adapter?");
            throw new UnsupportedOperationException(stringBuilder.toString());
        }

        /* renamed from: a */
        public Class m23272a(JsonReader jsonReader) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }
    }

    /* renamed from: com.google.gson.internal.bind.i$2 */
    static class C42432 extends C2660q<AtomicIntegerArray> {
        C42432() {
        }

        /* renamed from: b */
        public /* synthetic */ Object mo3332b(JsonReader jsonReader) {
            return m23312a(jsonReader);
        }

        /* renamed from: a */
        public AtomicIntegerArray m23312a(JsonReader jsonReader) {
            List arrayList = new ArrayList();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                try {
                    arrayList.add(Integer.valueOf(jsonReader.nextInt()));
                } catch (Throwable e) {
                    throw new JsonSyntaxException(e);
                }
            }
            jsonReader.endArray();
            jsonReader = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(jsonReader);
            for (int i = 0; i < jsonReader; i++) {
                atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
            }
            return atomicIntegerArray;
        }

        /* renamed from: a */
        public void m23314a(JsonWriter jsonWriter, AtomicIntegerArray atomicIntegerArray) {
            jsonWriter.beginArray();
            int length = atomicIntegerArray.length();
            for (int i = 0; i < length; i++) {
                jsonWriter.value((long) atomicIntegerArray.get(i));
            }
            jsonWriter.endArray();
        }
    }

    /* renamed from: com.google.gson.internal.bind.i$3 */
    static class C42443 extends C2660q<Number> {
        C42443() {
        }

        /* renamed from: b */
        public /* synthetic */ Object mo3332b(JsonReader jsonReader) {
            return m23316a(jsonReader);
        }

        /* renamed from: a */
        public Number m23316a(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Long.valueOf(jsonReader.nextLong());
            } catch (Throwable e) {
                throw new JsonSyntaxException(e);
            }
        }

        /* renamed from: a */
        public void m23317a(JsonWriter jsonWriter, Number number) {
            jsonWriter.value(number);
        }
    }

    /* renamed from: com.google.gson.internal.bind.i$4 */
    static class C42454 extends C2660q<Number> {
        C42454() {
        }

        /* renamed from: b */
        public /* synthetic */ Object mo3332b(JsonReader jsonReader) {
            return m23320a(jsonReader);
        }

        /* renamed from: a */
        public Number m23320a(JsonReader jsonReader) {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Float.valueOf((float) jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: a */
        public void m23321a(JsonWriter jsonWriter, Number number) {
            jsonWriter.value(number);
        }
    }

    /* renamed from: com.google.gson.internal.bind.i$5 */
    static class C42465 extends C2660q<Number> {
        C42465() {
        }

        /* renamed from: b */
        public /* synthetic */ Object mo3332b(JsonReader jsonReader) {
            return m23324a(jsonReader);
        }

        /* renamed from: a */
        public Number m23324a(JsonReader jsonReader) {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Double.valueOf(jsonReader.nextDouble());
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: a */
        public void m23325a(JsonWriter jsonWriter, Number number) {
            jsonWriter.value(number);
        }
    }

    /* renamed from: com.google.gson.internal.bind.i$6 */
    static class C42476 extends C2660q<Number> {
        C42476() {
        }

        /* renamed from: b */
        public /* synthetic */ Object mo3332b(JsonReader jsonReader) {
            return m23328a(jsonReader);
        }

        /* renamed from: a */
        public Number m23328a(JsonReader jsonReader) {
            JsonToken peek = jsonReader.peek();
            int i = AnonymousClass23.f11167a[peek.ordinal()];
            if (i != 1) {
                switch (i) {
                    case 3:
                        break;
                    case 4:
                        jsonReader.nextNull();
                        return null;
                    default:
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Expecting number, got: ");
                        stringBuilder.append(peek);
                        throw new JsonSyntaxException(stringBuilder.toString());
                }
            }
            return new LazilyParsedNumber(jsonReader.nextString());
        }

        /* renamed from: a */
        public void m23329a(JsonWriter jsonWriter, Number number) {
            jsonWriter.value(number);
        }
    }

    /* renamed from: com.google.gson.internal.bind.i$7 */
    static class C42487 extends C2660q<Character> {
        C42487() {
        }

        /* renamed from: b */
        public /* synthetic */ Object mo3332b(JsonReader jsonReader) {
            return m23332a(jsonReader);
        }

        /* renamed from: a */
        public Character m23332a(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader = jsonReader.nextString();
            if (jsonReader.length() == 1) {
                return Character.valueOf(jsonReader.charAt(0));
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expecting character, got: ");
            stringBuilder.append(jsonReader);
            throw new JsonSyntaxException(stringBuilder.toString());
        }

        /* renamed from: a */
        public void m23333a(JsonWriter jsonWriter, Character ch) {
            jsonWriter.value(ch == null ? null : String.valueOf(ch));
        }
    }

    /* renamed from: com.google.gson.internal.bind.i$8 */
    static class C42498 extends C2660q<String> {
        C42498() {
        }

        /* renamed from: b */
        public /* synthetic */ Object mo3332b(JsonReader jsonReader) {
            return m23336a(jsonReader);
        }

        /* renamed from: a */
        public String m23336a(JsonReader jsonReader) {
            JsonToken peek = jsonReader.peek();
            if (peek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            } else if (peek == JsonToken.BOOLEAN) {
                return Boolean.toString(jsonReader.nextBoolean());
            } else {
                return jsonReader.nextString();
            }
        }

        /* renamed from: a */
        public void m23338a(JsonWriter jsonWriter, String str) {
            jsonWriter.value(str);
        }
    }

    /* renamed from: com.google.gson.internal.bind.i$9 */
    static class C42509 extends C2660q<BigDecimal> {
        C42509() {
        }

        /* renamed from: b */
        public /* synthetic */ Object mo3332b(JsonReader jsonReader) {
            return m23340a(jsonReader);
        }

        /* renamed from: a */
        public BigDecimal m23340a(JsonReader jsonReader) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return new BigDecimal(jsonReader.nextString());
            } catch (Throwable e) {
                throw new JsonSyntaxException(e);
            }
        }

        /* renamed from: a */
        public void m23342a(JsonWriter jsonWriter, BigDecimal bigDecimal) {
            jsonWriter.value((Number) bigDecimal);
        }
    }

    /* renamed from: com.google.gson.internal.bind.i$a */
    private static final class C4251a<T extends Enum<T>> extends C2660q<T> {
        /* renamed from: a */
        private final Map<String, T> f17885a = new HashMap();
        /* renamed from: b */
        private final Map<T, String> f17886b = new HashMap();

        /* renamed from: b */
        public /* synthetic */ Object mo3332b(JsonReader jsonReader) {
            return m23344a(jsonReader);
        }

        public C4251a(Class<T> cls) {
            try {
                for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                    Object name = enumR.name();
                    C2621c c2621c = (C2621c) cls.getField(name).getAnnotation(C2621c.class);
                    if (c2621c != null) {
                        name = c2621c.m12856a();
                        for (Object put : c2621c.m12857b()) {
                            this.f17885a.put(put, enumR);
                        }
                    }
                    this.f17885a.put(name, enumR);
                    this.f17886b.put(enumR, name);
                }
            } catch (Class<T> cls2) {
                throw new AssertionError(cls2);
            }
        }

        /* renamed from: a */
        public T m23344a(JsonReader jsonReader) {
            if (jsonReader.peek() != JsonToken.NULL) {
                return (Enum) this.f17885a.get(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        /* renamed from: a */
        public void m23345a(JsonWriter jsonWriter, T t) {
            jsonWriter.value(t == null ? null : (String) this.f17886b.get(t));
        }
    }

    /* renamed from: a */
    public static <TT> C2661r m12943a(Class<TT> cls, C2660q<TT> c2660q) {
        return new TypeAdapters$32(cls, c2660q);
    }

    /* renamed from: a */
    public static <TT> C2661r m12944a(Class<TT> cls, Class<TT> cls2, C2660q<? super TT> c2660q) {
        return new TypeAdapters$33(cls, cls2, c2660q);
    }

    /* renamed from: b */
    public static <TT> C2661r m12946b(Class<TT> cls, Class<? extends TT> cls2, C2660q<? super TT> c2660q) {
        return new TypeAdapters$34(cls, cls2, c2660q);
    }

    /* renamed from: b */
    public static <T1> C2661r m12945b(Class<T1> cls, C2660q<T1> c2660q) {
        return new TypeAdapters$35(cls, c2660q);
    }
}
