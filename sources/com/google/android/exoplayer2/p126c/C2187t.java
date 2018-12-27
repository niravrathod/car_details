package com.google.android.exoplayer2.p126c;

import org.xmlpull.v1.XmlPullParser;

/* renamed from: com.google.android.exoplayer2.c.t */
public final class C2187t {
    /* renamed from: a */
    public static boolean m8065a(XmlPullParser xmlPullParser, String str) {
        return (!C2187t.m8064a(xmlPullParser) || xmlPullParser.getName().equals(str) == null) ? null : true;
    }

    /* renamed from: a */
    public static boolean m8064a(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 3 ? true : null;
    }

    /* renamed from: b */
    public static boolean m8067b(XmlPullParser xmlPullParser, String str) {
        return (!C2187t.m8066b(xmlPullParser) || xmlPullParser.getName().equals(str) == null) ? null : true;
    }

    /* renamed from: b */
    public static boolean m8066b(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2 ? true : null;
    }

    /* renamed from: c */
    public static String m8068c(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (str.equals(xmlPullParser.getAttributeName(i))) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }
}
