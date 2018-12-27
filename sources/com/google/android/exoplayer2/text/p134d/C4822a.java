package com.google.android.exoplayer2.text.p134d;

import android.util.Log;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.android.exoplayer2.p126c.C2187t;
import com.google.android.exoplayer2.text.C2348d;
import com.google.android.exoplayer2.text.C4693b;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: com.google.android.exoplayer2.text.d.a */
public final class C4822a extends C4693b {
    /* renamed from: a */
    private static final Pattern f21206a = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    /* renamed from: b */
    private static final Pattern f21207b = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    /* renamed from: c */
    private static final Pattern f21208c = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    /* renamed from: d */
    private static final Pattern f21209d = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    /* renamed from: e */
    private static final C2343a f21210e = new C2343a(30.0f, 1, 1);
    /* renamed from: f */
    private final XmlPullParserFactory f21211f;

    /* renamed from: com.google.android.exoplayer2.text.d.a$a */
    private static final class C2343a {
        /* renamed from: a */
        final float f7420a;
        /* renamed from: b */
        final int f7421b;
        /* renamed from: c */
        final int f7422c;

        C2343a(float f, int i, int i2) {
            this.f7420a = f;
            this.f7421b = i;
            this.f7422c = i2;
        }
    }

    /* renamed from: a */
    protected /* synthetic */ C2348d mo4689a(byte[] bArr, int i, boolean z) {
        return m28044b(bArr, i, z);
    }

    public C4822a() {
        super("TtmlDecoder");
        try {
            this.f21211f = XmlPullParserFactory.newInstance();
            this.f21211f.setNamespaceAware(true);
        } catch (Throwable e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* renamed from: b */
    protected C4044f m28044b(byte[] bArr, int i, boolean z) {
        try {
            XmlPullParser newPullParser = this.f21211f.newPullParser();
            Map hashMap = new HashMap();
            Map hashMap2 = new HashMap();
            C4044f c4044f = null;
            hashMap2.put("", new C2345c(null));
            int i2 = 0;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
            bArr = new LinkedList();
            C2343a c2343a = f21210e;
            for (i = newPullParser.getEventType(); i != 1; i = newPullParser.getEventType()) {
                C2344b c2344b = (C2344b) bArr.peekLast();
                if (i2 == 0) {
                    String name = newPullParser.getName();
                    if (i == 2) {
                        if ("tt".equals(name) != 0) {
                            c2343a = m28034a(newPullParser);
                        }
                        if (C4822a.m28042b(name) == 0) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Ignoring unsupported tag: ");
                            stringBuilder.append(newPullParser.getName());
                            Log.i("TtmlDecoder", stringBuilder.toString());
                            i2++;
                        } else if ("head".equals(name) != 0) {
                            m28038a(newPullParser, hashMap, hashMap2);
                        } else {
                            try {
                                C2344b a = m28035a(newPullParser, c2344b, hashMap2, c2343a);
                                bArr.addLast(a);
                                if (c2344b != null) {
                                    c2344b.m8557a(a);
                                }
                            } catch (int i3) {
                                Log.w("TtmlDecoder", "Suppressing parser error", i3);
                                i2++;
                            }
                        }
                    } else if (i3 == 4) {
                        c2344b.m8557a(C2344b.m8548a(newPullParser.getText()));
                    } else if (i3 == 3) {
                        if (newPullParser.getName().equals("tt") != 0) {
                            c4044f = new C4044f((C2344b) bArr.getLast(), hashMap, hashMap2);
                        }
                        bArr.removeLast();
                    }
                } else if (i3 == 2) {
                    i2++;
                } else if (i3 == 3) {
                    i2--;
                }
                newPullParser.next();
            }
            return c4044f;
        } catch (byte[] bArr2) {
            throw new SubtitleDecoderException("Unable to decode source", bArr2);
        } catch (byte[] bArr22) {
            throw new IllegalStateException("Unexpected error when reading input.", bArr22);
        }
    }

    /* renamed from: a */
    private C2343a m28034a(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split(" ");
            if (split.length == 2) {
                f = ((float) Integer.parseInt(split[0])) / ((float) Integer.parseInt(split[1]));
            } else {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
        }
        int i = f21210e.f7421b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i = Integer.parseInt(attributeValue3);
        }
        int i2 = f21210e.f7422c;
        xmlPullParser = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (xmlPullParser != null) {
            i2 = Integer.parseInt(xmlPullParser);
        }
        return new C2343a(((float) parseInt) * f, i, i2);
    }

    /* renamed from: a */
    private Map<String, C2347e> m28038a(XmlPullParser xmlPullParser, Map<String, C2347e> map, Map<String, C2345c> map2) {
        do {
            xmlPullParser.next();
            if (C2187t.m8067b(xmlPullParser, FacebookAdapter.KEY_STYLE)) {
                String c = C2187t.m8068c(xmlPullParser, FacebookAdapter.KEY_STYLE);
                C2347e a = m28037a(xmlPullParser, new C2347e());
                if (c != null) {
                    for (Object obj : m28040a(c)) {
                        a.m8569a((C2347e) map.get(obj));
                    }
                }
                if (a.m8585i() != null) {
                    map.put(a.m8585i(), a);
                }
            } else if (C2187t.m8067b(xmlPullParser, "region")) {
                C2345c b = m28041b(xmlPullParser);
                if (b != null) {
                    map2.put(b.f7434a, b);
                }
            }
        } while (!C2187t.m8065a(xmlPullParser, "head"));
        return map;
    }

    /* renamed from: b */
    private com.google.android.exoplayer2.text.p134d.C2345c m28041b(org.xmlpull.v1.XmlPullParser r13) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r12 = this;
        r0 = "id";
        r2 = com.google.android.exoplayer2.p126c.C2187t.m8068c(r13, r0);
        r0 = 0;
        if (r2 != 0) goto L_0x000a;
    L_0x0009:
        return r0;
    L_0x000a:
        r1 = "origin";
        r1 = com.google.android.exoplayer2.p126c.C2187t.m8068c(r13, r1);
        r3 = 0;
        r4 = 2;
        r5 = 1120403456; // 0x42c80000 float:100.0 double:5.53552857E-315;
        r6 = 1;
        if (r1 == 0) goto L_0x0067;
    L_0x0017:
        r3 = f21209d;
        r3 = r3.matcher(r1);
        r7 = r3.matches();
        if (r7 == 0) goto L_0x0050;
    L_0x0023:
        r7 = r3.group(r6);	 Catch:{ NumberFormatException -> 0x0039 }
        r7 = java.lang.Float.parseFloat(r7);	 Catch:{ NumberFormatException -> 0x0039 }
        r7 = r7 / r5;	 Catch:{ NumberFormatException -> 0x0039 }
        r3 = r3.group(r4);	 Catch:{ NumberFormatException -> 0x0039 }
        r3 = java.lang.Float.parseFloat(r3);	 Catch:{ NumberFormatException -> 0x0039 }
        r3 = r3 / r5;
        r11 = r7;
        r7 = r3;
        r3 = r11;
        goto L_0x0068;
    L_0x0039:
        r13 = "TtmlDecoder";
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Ignoring region with malformed origin: ";
        r2.append(r3);
        r2.append(r1);
        r1 = r2.toString();
        android.util.Log.w(r13, r1);
        return r0;
    L_0x0050:
        r13 = "TtmlDecoder";
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Ignoring region with unsupported origin: ";
        r2.append(r3);
        r2.append(r1);
        r1 = r2.toString();
        android.util.Log.w(r13, r1);
        return r0;
    L_0x0067:
        r7 = 0;
    L_0x0068:
        r8 = "extent";
        r8 = com.google.android.exoplayer2.p126c.C2187t.m8068c(r13, r8);
        r9 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        if (r8 == 0) goto L_0x00c0;
    L_0x0072:
        r9 = f21209d;
        r8 = r9.matcher(r8);
        r9 = r8.matches();
        if (r9 == 0) goto L_0x00a9;
    L_0x007e:
        r9 = r8.group(r6);	 Catch:{ NumberFormatException -> 0x0092 }
        r9 = java.lang.Float.parseFloat(r9);	 Catch:{ NumberFormatException -> 0x0092 }
        r9 = r9 / r5;	 Catch:{ NumberFormatException -> 0x0092 }
        r8 = r8.group(r4);	 Catch:{ NumberFormatException -> 0x0092 }
        r8 = java.lang.Float.parseFloat(r8);	 Catch:{ NumberFormatException -> 0x0092 }
        r0 = r8 / r5;
        goto L_0x00c2;
    L_0x0092:
        r13 = "TtmlDecoder";
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Ignoring region with malformed extent: ";
        r2.append(r3);
        r2.append(r1);
        r1 = r2.toString();
        android.util.Log.w(r13, r1);
        return r0;
    L_0x00a9:
        r13 = "TtmlDecoder";
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Ignoring region with unsupported extent: ";
        r2.append(r3);
        r2.append(r1);
        r1 = r2.toString();
        android.util.Log.w(r13, r1);
        return r0;
    L_0x00c0:
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
    L_0x00c2:
        r1 = "displayAlign";
        r13 = com.google.android.exoplayer2.p126c.C2187t.m8068c(r13, r1);
        r1 = 0;
        if (r13 == 0) goto L_0x0100;
    L_0x00cb:
        r13 = r13.toLowerCase();
        r5 = -1;
        r8 = r13.hashCode();
        r10 = -1364013995; // 0xffffffffaeb2cc55 float:-8.1307995E-11 double:NaN;
        if (r8 == r10) goto L_0x00e9;
    L_0x00d9:
        r10 = 92734940; // 0x58705dc float:1.2697491E-35 double:4.5817148E-316;
        if (r8 == r10) goto L_0x00df;
    L_0x00de:
        goto L_0x00f2;
    L_0x00df:
        r8 = "after";
        r13 = r13.equals(r8);
        if (r13 == 0) goto L_0x00f2;
    L_0x00e7:
        r5 = 1;
        goto L_0x00f2;
    L_0x00e9:
        r8 = "center";
        r13 = r13.equals(r8);
        if (r13 == 0) goto L_0x00f2;
    L_0x00f1:
        r5 = 0;
    L_0x00f2:
        switch(r5) {
            case 0: goto L_0x00fa;
            case 1: goto L_0x00f6;
            default: goto L_0x00f5;
        };
    L_0x00f5:
        goto L_0x0100;
    L_0x00f6:
        r7 = r7 + r0;
        r4 = r7;
        r6 = 2;
        goto L_0x0102;
    L_0x00fa:
        r13 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = r0 / r13;
        r7 = r7 + r0;
        r4 = r7;
        goto L_0x0102;
    L_0x0100:
        r4 = r7;
        r6 = 0;
    L_0x0102:
        r13 = new com.google.android.exoplayer2.text.d.c;
        r5 = 0;
        r1 = r13;
        r7 = r9;
        r1.<init>(r2, r3, r4, r5, r6, r7);
        return r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.d.a.b(org.xmlpull.v1.XmlPullParser):com.google.android.exoplayer2.text.d.c");
    }

    /* renamed from: a */
    private String[] m28040a(String str) {
        return str.split("\\s+");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private com.google.android.exoplayer2.text.p134d.C2347e m28037a(org.xmlpull.v1.XmlPullParser r12, com.google.android.exoplayer2.text.p134d.C2347e r13) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r11 = this;
        r0 = r12.getAttributeCount();
        r1 = 0;
        r2 = r13;
        r13 = 0;
    L_0x0007:
        if (r13 >= r0) goto L_0x0219;
    L_0x0009:
        r3 = r12.getAttributeValue(r13);
        r4 = r12.getAttributeName(r13);
        r5 = r4.hashCode();
        r6 = 4;
        r7 = 2;
        r8 = 3;
        r9 = -1;
        r10 = 1;
        switch(r5) {
            case -1550943582: goto L_0x006f;
            case -1224696685: goto L_0x0065;
            case -1065511464: goto L_0x005b;
            case -879295043: goto L_0x0050;
            case -734428249: goto L_0x0046;
            case 3355: goto L_0x003c;
            case 94842723: goto L_0x0032;
            case 365601008: goto L_0x0028;
            case 1287124693: goto L_0x001e;
            default: goto L_0x001d;
        };
    L_0x001d:
        goto L_0x0079;
    L_0x001e:
        r5 = "backgroundColor";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x0079;
    L_0x0026:
        r4 = 1;
        goto L_0x007a;
    L_0x0028:
        r5 = "fontSize";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x0079;
    L_0x0030:
        r4 = 4;
        goto L_0x007a;
    L_0x0032:
        r5 = "color";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x0079;
    L_0x003a:
        r4 = 2;
        goto L_0x007a;
    L_0x003c:
        r5 = "id";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x0079;
    L_0x0044:
        r4 = 0;
        goto L_0x007a;
    L_0x0046:
        r5 = "fontWeight";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x0079;
    L_0x004e:
        r4 = 5;
        goto L_0x007a;
    L_0x0050:
        r5 = "textDecoration";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x0079;
    L_0x0058:
        r4 = 8;
        goto L_0x007a;
    L_0x005b:
        r5 = "textAlign";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x0079;
    L_0x0063:
        r4 = 7;
        goto L_0x007a;
    L_0x0065:
        r5 = "fontFamily";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x0079;
    L_0x006d:
        r4 = 3;
        goto L_0x007a;
    L_0x006f:
        r5 = "fontStyle";
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x0079;
    L_0x0077:
        r4 = 6;
        goto L_0x007a;
    L_0x0079:
        r4 = -1;
    L_0x007a:
        switch(r4) {
            case 0: goto L_0x0201;
            case 1: goto L_0x01de;
            case 2: goto L_0x01bb;
            case 3: goto L_0x01b2;
            case 4: goto L_0x0190;
            case 5: goto L_0x0180;
            case 6: goto L_0x0170;
            case 7: goto L_0x00f1;
            case 8: goto L_0x007f;
            default: goto L_0x007d;
        };
    L_0x007d:
        goto L_0x0215;
    L_0x007f:
        r3 = com.google.android.exoplayer2.p126c.C2186s.m8061d(r3);
        r4 = r3.hashCode();
        r5 = -1461280213; // 0xffffffffa8e6a22b float:-2.5605459E-14 double:NaN;
        if (r4 == r5) goto L_0x00b9;
    L_0x008c:
        r5 = -1026963764; // 0xffffffffc2c9c6cc float:-100.888275 double:NaN;
        if (r4 == r5) goto L_0x00b0;
    L_0x0091:
        r5 = 913457136; // 0x36723ff0 float:3.6098027E-6 double:4.5130779E-315;
        if (r4 == r5) goto L_0x00a6;
    L_0x0096:
        r5 = 1679736913; // 0x641ec051 float:1.1713774E22 double:8.29900303E-315;
        if (r4 == r5) goto L_0x009c;
    L_0x009b:
        goto L_0x00c3;
    L_0x009c:
        r4 = "linethrough";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x00c3;
    L_0x00a4:
        r7 = 0;
        goto L_0x00c4;
    L_0x00a6:
        r4 = "nolinethrough";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x00c3;
    L_0x00ae:
        r7 = 1;
        goto L_0x00c4;
    L_0x00b0:
        r4 = "underline";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x00c3;
    L_0x00b8:
        goto L_0x00c4;
    L_0x00b9:
        r4 = "nounderline";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x00c3;
    L_0x00c1:
        r7 = 3;
        goto L_0x00c4;
    L_0x00c3:
        r7 = -1;
    L_0x00c4:
        switch(r7) {
            case 0: goto L_0x00e7;
            case 1: goto L_0x00dd;
            case 2: goto L_0x00d3;
            case 3: goto L_0x00c9;
            default: goto L_0x00c7;
        };
    L_0x00c7:
        goto L_0x0215;
    L_0x00c9:
        r2 = r11.m28036a(r2);
        r2 = r2.m8574b(r1);
        goto L_0x0215;
    L_0x00d3:
        r2 = r11.m28036a(r2);
        r2 = r2.m8574b(r10);
        goto L_0x0215;
    L_0x00dd:
        r2 = r11.m28036a(r2);
        r2 = r2.m8571a(r1);
        goto L_0x0215;
    L_0x00e7:
        r2 = r11.m28036a(r2);
        r2 = r2.m8571a(r10);
        goto L_0x0215;
    L_0x00f1:
        r3 = com.google.android.exoplayer2.p126c.C2186s.m8061d(r3);
        r4 = r3.hashCode();
        switch(r4) {
            case -1364013995: goto L_0x0125;
            case 100571: goto L_0x011b;
            case 3317767: goto L_0x0111;
            case 108511772: goto L_0x0107;
            case 109757538: goto L_0x00fd;
            default: goto L_0x00fc;
        };
    L_0x00fc:
        goto L_0x012e;
    L_0x00fd:
        r4 = "start";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x012e;
    L_0x0105:
        r6 = 1;
        goto L_0x012f;
    L_0x0107:
        r4 = "right";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x012e;
    L_0x010f:
        r6 = 2;
        goto L_0x012f;
    L_0x0111:
        r4 = "left";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x012e;
    L_0x0119:
        r6 = 0;
        goto L_0x012f;
    L_0x011b:
        r4 = "end";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x012e;
    L_0x0123:
        r6 = 3;
        goto L_0x012f;
    L_0x0125:
        r4 = "center";
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x012e;
    L_0x012d:
        goto L_0x012f;
    L_0x012e:
        r6 = -1;
    L_0x012f:
        switch(r6) {
            case 0: goto L_0x0164;
            case 1: goto L_0x0158;
            case 2: goto L_0x014c;
            case 3: goto L_0x0140;
            case 4: goto L_0x0134;
            default: goto L_0x0132;
        };
    L_0x0132:
        goto L_0x0215;
    L_0x0134:
        r2 = r11.m28036a(r2);
        r3 = android.text.Layout.Alignment.ALIGN_CENTER;
        r2 = r2.m8568a(r3);
        goto L_0x0215;
    L_0x0140:
        r2 = r11.m28036a(r2);
        r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE;
        r2 = r2.m8568a(r3);
        goto L_0x0215;
    L_0x014c:
        r2 = r11.m28036a(r2);
        r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE;
        r2 = r2.m8568a(r3);
        goto L_0x0215;
    L_0x0158:
        r2 = r11.m28036a(r2);
        r3 = android.text.Layout.Alignment.ALIGN_NORMAL;
        r2 = r2.m8568a(r3);
        goto L_0x0215;
    L_0x0164:
        r2 = r11.m28036a(r2);
        r3 = android.text.Layout.Alignment.ALIGN_NORMAL;
        r2 = r2.m8568a(r3);
        goto L_0x0215;
    L_0x0170:
        r2 = r11.m28036a(r2);
        r4 = "italic";
        r3 = r4.equalsIgnoreCase(r3);
        r2 = r2.m8579d(r3);
        goto L_0x0215;
    L_0x0180:
        r2 = r11.m28036a(r2);
        r4 = "bold";
        r3 = r4.equalsIgnoreCase(r3);
        r2 = r2.m8577c(r3);
        goto L_0x0215;
    L_0x0190:
        r4 = r11.m28036a(r2);	 Catch:{ SubtitleDecoderException -> 0x019b }
        com.google.android.exoplayer2.text.p134d.C4822a.m28039a(r3, r4);	 Catch:{ SubtitleDecoderException -> 0x019a }
        r2 = r4;
        goto L_0x0215;
    L_0x019a:
        r2 = r4;
    L_0x019b:
        r4 = "TtmlDecoder";
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = "Failed parsing fontSize value: ";
        r5.append(r6);
        r5.append(r3);
        r3 = r5.toString();
        android.util.Log.w(r4, r3);
        goto L_0x0215;
    L_0x01b2:
        r2 = r11.m28036a(r2);
        r2 = r2.m8570a(r3);
        goto L_0x0215;
    L_0x01bb:
        r2 = r11.m28036a(r2);
        r4 = com.google.android.exoplayer2.p126c.C2165c.m7927a(r3);	 Catch:{ IllegalArgumentException -> 0x01c7 }
        r2.m8567a(r4);	 Catch:{ IllegalArgumentException -> 0x01c7 }
        goto L_0x0215;
    L_0x01c7:
        r4 = "TtmlDecoder";
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = "Failed parsing color value: ";
        r5.append(r6);
        r5.append(r3);
        r3 = r5.toString();
        android.util.Log.w(r4, r3);
        goto L_0x0215;
    L_0x01de:
        r2 = r11.m28036a(r2);
        r4 = com.google.android.exoplayer2.p126c.C2165c.m7927a(r3);	 Catch:{ IllegalArgumentException -> 0x01ea }
        r2.m8572b(r4);	 Catch:{ IllegalArgumentException -> 0x01ea }
        goto L_0x0215;
    L_0x01ea:
        r4 = "TtmlDecoder";
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = "Failed parsing background value: ";
        r5.append(r6);
        r5.append(r3);
        r3 = r5.toString();
        android.util.Log.w(r4, r3);
        goto L_0x0215;
    L_0x0201:
        r4 = "style";
        r5 = r12.getName();
        r4 = r4.equals(r5);
        if (r4 == 0) goto L_0x0215;
    L_0x020d:
        r2 = r11.m28036a(r2);
        r2 = r2.m8573b(r3);
    L_0x0215:
        r13 = r13 + 1;
        goto L_0x0007;
    L_0x0219:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.d.a.a(org.xmlpull.v1.XmlPullParser, com.google.android.exoplayer2.text.d.e):com.google.android.exoplayer2.text.d.e");
    }

    /* renamed from: a */
    private C2347e m28036a(C2347e c2347e) {
        return c2347e == null ? new C2347e() : c2347e;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private com.google.android.exoplayer2.text.p134d.C2344b m28035a(org.xmlpull.v1.XmlPullParser r20, com.google.android.exoplayer2.text.p134d.C2344b r21, java.util.Map<java.lang.String, com.google.android.exoplayer2.text.p134d.C2345c> r22, com.google.android.exoplayer2.text.p134d.C4822a.C2343a r23) {
        /*
        r19 = this;
        r0 = r19;
        r1 = r20;
        r2 = r21;
        r3 = r23;
        r4 = "";
        r5 = r20.getAttributeCount();
        r6 = 0;
        r12 = r0.m28037a(r1, r6);
        r17 = r6;
        r10 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r13 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r15 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r6 = r4;
        r4 = 0;
    L_0x0026:
        if (r4 >= r5) goto L_0x00a1;
    L_0x0028:
        r7 = r1.getAttributeName(r4);
        r8 = r1.getAttributeValue(r4);
        r18 = r7.hashCode();
        switch(r18) {
            case -934795532: goto L_0x0060;
            case 99841: goto L_0x0056;
            case 100571: goto L_0x004c;
            case 93616297: goto L_0x0042;
            case 109780401: goto L_0x0038;
            default: goto L_0x0037;
        };
    L_0x0037:
        goto L_0x006a;
    L_0x0038:
        r9 = "style";
        r7 = r7.equals(r9);
        if (r7 == 0) goto L_0x006a;
    L_0x0040:
        r7 = 3;
        goto L_0x006b;
    L_0x0042:
        r9 = "begin";
        r7 = r7.equals(r9);
        if (r7 == 0) goto L_0x006a;
    L_0x004a:
        r7 = 0;
        goto L_0x006b;
    L_0x004c:
        r9 = "end";
        r7 = r7.equals(r9);
        if (r7 == 0) goto L_0x006a;
    L_0x0054:
        r7 = 1;
        goto L_0x006b;
    L_0x0056:
        r9 = "dur";
        r7 = r7.equals(r9);
        if (r7 == 0) goto L_0x006a;
    L_0x005e:
        r7 = 2;
        goto L_0x006b;
    L_0x0060:
        r9 = "region";
        r7 = r7.equals(r9);
        if (r7 == 0) goto L_0x006a;
    L_0x0068:
        r7 = 4;
        goto L_0x006b;
    L_0x006a:
        r7 = -1;
    L_0x006b:
        switch(r7) {
            case 0: goto L_0x0097;
            case 1: goto L_0x008f;
            case 2: goto L_0x0087;
            case 3: goto L_0x007b;
            case 4: goto L_0x0071;
            default: goto L_0x006e;
        };
    L_0x006e:
        r7 = r22;
        goto L_0x009e;
    L_0x0071:
        r7 = r22;
        r9 = r7.containsKey(r8);
        if (r9 == 0) goto L_0x009e;
    L_0x0079:
        r6 = r8;
        goto L_0x009e;
    L_0x007b:
        r7 = r22;
        r8 = r0.m28040a(r8);
        r9 = r8.length;
        if (r9 <= 0) goto L_0x009e;
    L_0x0084:
        r17 = r8;
        goto L_0x009e;
    L_0x0087:
        r7 = r22;
        r8 = com.google.android.exoplayer2.text.p134d.C4822a.m28033a(r8, r3);
        r15 = r8;
        goto L_0x009e;
    L_0x008f:
        r7 = r22;
        r8 = com.google.android.exoplayer2.text.p134d.C4822a.m28033a(r8, r3);
        r13 = r8;
        goto L_0x009e;
    L_0x0097:
        r7 = r22;
        r8 = com.google.android.exoplayer2.text.p134d.C4822a.m28033a(r8, r3);
        r10 = r8;
    L_0x009e:
        r4 = r4 + 1;
        goto L_0x0026;
    L_0x00a1:
        if (r2 == 0) goto L_0x00bd;
    L_0x00a3:
        r3 = r2.f7426d;
        r7 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r5 == 0) goto L_0x00c2;
    L_0x00ae:
        r3 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1));
        if (r3 == 0) goto L_0x00b5;
    L_0x00b2:
        r3 = r2.f7426d;
        r10 = r10 + r3;
    L_0x00b5:
        r3 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1));
        if (r3 == 0) goto L_0x00c2;
    L_0x00b9:
        r3 = r2.f7426d;
        r13 = r13 + r3;
        goto L_0x00c2;
    L_0x00bd:
        r7 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
    L_0x00c2:
        r3 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1));
        if (r3 != 0) goto L_0x00d8;
    L_0x00c6:
        r3 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1));
        if (r3 == 0) goto L_0x00cd;
    L_0x00ca:
        r15 = r15 + r10;
        r13 = r15;
        goto L_0x00d8;
    L_0x00cd:
        if (r2 == 0) goto L_0x00d8;
    L_0x00cf:
        r3 = r2.f7427e;
        r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r5 == 0) goto L_0x00d8;
    L_0x00d5:
        r2 = r2.f7427e;
        r13 = r2;
    L_0x00d8:
        r7 = r20.getName();
        r8 = r10;
        r10 = r13;
        r13 = r17;
        r14 = r6;
        r1 = com.google.android.exoplayer2.text.p134d.C2344b.m8549a(r7, r8, r10, r12, r13, r14);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.d.a.a(org.xmlpull.v1.XmlPullParser, com.google.android.exoplayer2.text.d.b, java.util.Map, com.google.android.exoplayer2.text.d.a$a):com.google.android.exoplayer2.text.d.b");
    }

    /* renamed from: b */
    private static boolean m28042b(String str) {
        if (!(str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals(FacebookAdapter.KEY_STYLE) || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("smpte:image") || str.equals("smpte:data"))) {
            if (str.equals("smpte:information") == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static void m28039a(String str, C2347e c2347e) {
        Matcher matcher;
        String[] split = str.split("\\s+");
        if (split.length == 1) {
            matcher = f21208c.matcher(str);
        } else if (split.length == 2) {
            matcher = f21208c.matcher(split[1]);
            Log.w("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            c2347e = new StringBuilder();
            c2347e.append("Invalid number of entries for fontSize: ");
            c2347e.append(split.length);
            c2347e.append(".");
            throw new SubtitleDecoderException(c2347e.toString());
        }
        if (matcher.matches()) {
            String group = matcher.group(3);
            Object obj = -1;
            int hashCode = group.hashCode();
            if (hashCode != 37) {
                if (hashCode != 3240) {
                    if (hashCode == 3592) {
                        if (group.equals("px")) {
                            obj = null;
                        }
                    }
                } else if (group.equals("em")) {
                    obj = 1;
                }
            } else if (group.equals("%")) {
                obj = 2;
            }
            switch (obj) {
                case null:
                    c2347e.m8576c(1);
                    break;
                case 1:
                    c2347e.m8576c(2);
                    break;
                case 2:
                    c2347e.m8576c(3);
                    break;
                default:
                    c2347e = new StringBuilder();
                    c2347e.append("Invalid unit for fontSize: '");
                    c2347e.append(group);
                    c2347e.append("'.");
                    throw new SubtitleDecoderException(c2347e.toString());
            }
            c2347e.m8566a(Float.valueOf(matcher.group(1)).floatValue());
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid expression for fontSize: '");
        stringBuilder.append(str);
        stringBuilder.append("'.");
        throw new SubtitleDecoderException(stringBuilder.toString());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static long m28033a(java.lang.String r14, com.google.android.exoplayer2.text.p134d.C4822a.C2343a r15) {
        /*
        r0 = f21206a;
        r0 = r0.matcher(r14);
        r1 = r0.matches();
        r2 = 4696837146684686336; // 0x412e848000000000 float:0.0 double:1000000.0;
        r4 = 5;
        r5 = 4;
        r6 = 3;
        r7 = 2;
        r8 = 1;
        if (r1 == 0) goto L_0x008b;
    L_0x0016:
        r14 = r0.group(r8);
        r8 = java.lang.Long.parseLong(r14);
        r10 = 3600; // 0xe10 float:5.045E-42 double:1.7786E-320;
        r8 = r8 * r10;
        r8 = (double) r8;
        r14 = r0.group(r7);
        r10 = java.lang.Long.parseLong(r14);
        r12 = 60;
        r10 = r10 * r12;
        r10 = (double) r10;
        java.lang.Double.isNaN(r8);
        java.lang.Double.isNaN(r10);
        r8 = r8 + r10;
        r14 = r0.group(r6);
        r6 = java.lang.Long.parseLong(r14);
        r6 = (double) r6;
        java.lang.Double.isNaN(r6);
        r8 = r8 + r6;
        r14 = r0.group(r5);
        r5 = 0;
        if (r14 == 0) goto L_0x0051;
    L_0x004c:
        r10 = java.lang.Double.parseDouble(r14);
        goto L_0x0052;
    L_0x0051:
        r10 = r5;
    L_0x0052:
        r14 = 0;
        r8 = r8 + r10;
        r14 = r0.group(r4);
        if (r14 == 0) goto L_0x0064;
    L_0x005a:
        r10 = java.lang.Long.parseLong(r14);
        r14 = (float) r10;
        r1 = r15.f7420a;
        r14 = r14 / r1;
        r10 = (double) r14;
        goto L_0x0065;
    L_0x0064:
        r10 = r5;
    L_0x0065:
        r14 = 0;
        r8 = r8 + r10;
        r14 = 6;
        r14 = r0.group(r14);
        if (r14 == 0) goto L_0x0085;
    L_0x006e:
        r0 = java.lang.Long.parseLong(r14);
        r0 = (double) r0;
        r14 = r15.f7421b;
        r4 = (double) r14;
        java.lang.Double.isNaN(r0);
        java.lang.Double.isNaN(r4);
        r0 = r0 / r4;
        r14 = r15.f7420a;
        r14 = (double) r14;
        java.lang.Double.isNaN(r14);
        r5 = r0 / r14;
    L_0x0085:
        r14 = 0;
        r8 = r8 + r5;
        r8 = r8 * r2;
        r14 = (long) r8;
        return r14;
    L_0x008b:
        r0 = f21207b;
        r0 = r0.matcher(r14);
        r1 = r0.matches();
        if (r1 == 0) goto L_0x0123;
    L_0x0097:
        r14 = r0.group(r8);
        r9 = java.lang.Double.parseDouble(r14);
        r14 = r0.group(r7);
        r0 = -1;
        r1 = r14.hashCode();
        r11 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        if (r1 == r11) goto L_0x00ed;
    L_0x00ac:
        r5 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        if (r1 == r5) goto L_0x00e3;
    L_0x00b0:
        r5 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        if (r1 == r5) goto L_0x00d9;
    L_0x00b4:
        r5 = 3494; // 0xda6 float:4.896E-42 double:1.7263E-320;
        if (r1 == r5) goto L_0x00cf;
    L_0x00b8:
        switch(r1) {
            case 115: goto L_0x00c5;
            case 116: goto L_0x00bc;
            default: goto L_0x00bb;
        };
    L_0x00bb:
        goto L_0x00f7;
    L_0x00bc:
        r1 = "t";
        r14 = r14.equals(r1);
        if (r14 == 0) goto L_0x00f7;
    L_0x00c4:
        goto L_0x00f8;
    L_0x00c5:
        r1 = "s";
        r14 = r14.equals(r1);
        if (r14 == 0) goto L_0x00f7;
    L_0x00cd:
        r4 = 2;
        goto L_0x00f8;
    L_0x00cf:
        r1 = "ms";
        r14 = r14.equals(r1);
        if (r14 == 0) goto L_0x00f7;
    L_0x00d7:
        r4 = 3;
        goto L_0x00f8;
    L_0x00d9:
        r1 = "m";
        r14 = r14.equals(r1);
        if (r14 == 0) goto L_0x00f7;
    L_0x00e1:
        r4 = 1;
        goto L_0x00f8;
    L_0x00e3:
        r1 = "h";
        r14 = r14.equals(r1);
        if (r14 == 0) goto L_0x00f7;
    L_0x00eb:
        r4 = 0;
        goto L_0x00f8;
    L_0x00ed:
        r1 = "f";
        r14 = r14.equals(r1);
        if (r14 == 0) goto L_0x00f7;
    L_0x00f5:
        r4 = 4;
        goto L_0x00f8;
    L_0x00f7:
        r4 = -1;
    L_0x00f8:
        switch(r4) {
            case 0: goto L_0x0118;
            case 1: goto L_0x0113;
            case 2: goto L_0x011f;
            case 3: goto L_0x010c;
            case 4: goto L_0x0104;
            case 5: goto L_0x00fc;
            default: goto L_0x00fb;
        };
    L_0x00fb:
        goto L_0x011f;
    L_0x00fc:
        r14 = r15.f7422c;
        r14 = (double) r14;
        java.lang.Double.isNaN(r14);
        r9 = r9 / r14;
        goto L_0x011f;
    L_0x0104:
        r14 = r15.f7420a;
        r14 = (double) r14;
        java.lang.Double.isNaN(r14);
        r9 = r9 / r14;
        goto L_0x011f;
    L_0x010c:
        r14 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        r9 = r9 / r14;
        goto L_0x011f;
    L_0x0113:
        r14 = 4633641066610819072; // 0x404e000000000000 float:0.0 double:60.0;
        r9 = r9 * r14;
        goto L_0x011f;
    L_0x0118:
        r14 = 4660134898793709568; // 0x40ac200000000000 float:0.0 double:3600.0;
        r9 = r9 * r14;
    L_0x011f:
        r9 = r9 * r2;
        r14 = (long) r9;
        return r14;
    L_0x0123:
        r15 = new com.google.android.exoplayer2.text.SubtitleDecoderException;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Malformed time expression: ";
        r0.append(r1);
        r0.append(r14);
        r14 = r0.toString();
        r15.<init>(r14);
        throw r15;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.d.a.a(java.lang.String, com.google.android.exoplayer2.text.d.a$a):long");
    }
}
