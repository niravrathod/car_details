package android.support.v4.content.p014a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.p005a.C0066a.C0065b;
import android.support.v4.p015d.C0398a;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v4.content.a.a */
public class C0383a {

    /* renamed from: android.support.v4.content.a.a$a */
    public interface C0381a {
    }

    /* renamed from: android.support.v4.content.a.a$c */
    public static final class C0382c {
        /* renamed from: a */
        private final String f1320a;
        /* renamed from: b */
        private int f1321b;
        /* renamed from: c */
        private boolean f1322c;
        /* renamed from: d */
        private int f1323d;

        public C0382c(String str, int i, boolean z, int i2) {
            this.f1320a = str;
            this.f1321b = i;
            this.f1322c = z;
            this.f1323d = i2;
        }

        /* renamed from: a */
        public String m1401a() {
            return this.f1320a;
        }

        /* renamed from: b */
        public int m1402b() {
            return this.f1321b;
        }

        /* renamed from: c */
        public boolean m1403c() {
            return this.f1322c;
        }

        /* renamed from: d */
        public int m1404d() {
            return this.f1323d;
        }
    }

    /* renamed from: android.support.v4.content.a.a$b */
    public static final class C3122b implements C0381a {
        /* renamed from: a */
        private final C0382c[] f13214a;

        public C3122b(C0382c[] c0382cArr) {
            this.f13214a = c0382cArr;
        }

        /* renamed from: a */
        public C0382c[] m15576a() {
            return this.f13214a;
        }
    }

    /* renamed from: android.support.v4.content.a.a$d */
    public static final class C3123d implements C0381a {
        /* renamed from: a */
        private final C0398a f13215a;
        /* renamed from: b */
        private final int f13216b;
        /* renamed from: c */
        private final int f13217c;

        public C3123d(C0398a c0398a, int i, int i2) {
            this.f13215a = c0398a;
            this.f13217c = i;
            this.f13216b = i2;
        }

        /* renamed from: a */
        public C0398a m15577a() {
            return this.f13215a;
        }

        /* renamed from: b */
        public int m15578b() {
            return this.f13217c;
        }

        /* renamed from: c */
        public int m15579c() {
            return this.f13216b;
        }
    }

    /* renamed from: a */
    public static C0381a m1405a(XmlPullParser xmlPullParser, Resources resources) {
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2 || next == 1) {
                if (next == 2) {
                    return C0383a.m1409b(xmlPullParser, resources);
                }
                throw new XmlPullParserException("No start tag found");
            }
        }
        if (next == 2) {
            return C0383a.m1409b(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: b */
    private static C0381a m1409b(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return C0383a.m1410c(xmlPullParser, resources);
        }
        C0383a.m1408a(xmlPullParser);
        return null;
    }

    /* renamed from: c */
    private static C0381a m1410c(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0065b.FontFamily);
        String string = obtainAttributes.getString(C0065b.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(C0065b.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(C0065b.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(C0065b.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(C0065b.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(C0065b.FontFamily_fontProviderFetchTimeout, 500);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            List arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(C0383a.m1411d(xmlPullParser, resources));
                    } else {
                        C0383a.m1408a(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty() != null) {
                return null;
            }
            return new C3122b((C0382c[]) arrayList.toArray(new C0382c[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            C0383a.m1408a(xmlPullParser);
        }
        return new C3123d(new C0398a(string, string2, string3, C0383a.m1406a(resources, resourceId)), integer, integer2);
    }

    /* renamed from: a */
    public static List<List<byte[]>> m1406a(Resources resources, int i) {
        List<List<byte[]>> list = null;
        if (i != 0) {
            TypedArray obtainTypedArray = resources.obtainTypedArray(i);
            if (obtainTypedArray.length() > 0) {
                list = new ArrayList();
                if ((obtainTypedArray.getResourceId(0, 0) != 0 ? 1 : null) != null) {
                    for (i = 0; i < obtainTypedArray.length(); i++) {
                        list.add(C0383a.m1407a(resources.getStringArray(obtainTypedArray.getResourceId(i, 0))));
                    }
                } else {
                    list.add(C0383a.m1407a(resources.getStringArray(i)));
                }
            }
            obtainTypedArray.recycle();
        }
        return list != null ? list : Collections.emptyList();
    }

    /* renamed from: a */
    private static List<byte[]> m1407a(String[] strArr) {
        List<byte[]> arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }

    /* renamed from: d */
    private static C0382c m1411d(XmlPullParser xmlPullParser, Resources resources) {
        resources = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0065b.FontFamilyFont);
        int i = resources.getInt(resources.hasValue(C0065b.FontFamilyFont_fontWeight) ? C0065b.FontFamilyFont_fontWeight : C0065b.FontFamilyFont_android_fontWeight, 400);
        boolean z = true;
        if (1 != resources.getInt(resources.hasValue(C0065b.FontFamilyFont_fontStyle) ? C0065b.FontFamilyFont_fontStyle : C0065b.FontFamilyFont_android_fontStyle, 0)) {
            z = false;
        }
        int i2 = resources.hasValue(C0065b.FontFamilyFont_font) ? C0065b.FontFamilyFont_font : C0065b.FontFamilyFont_android_font;
        int resourceId = resources.getResourceId(i2, 0);
        String string = resources.getString(i2);
        resources.recycle();
        while (xmlPullParser.next() != 3) {
            C0383a.m1408a(xmlPullParser);
        }
        return new C0382c(string, i, z, resourceId);
    }

    /* renamed from: a */
    private static void m1408a(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            switch (xmlPullParser.next()) {
                case 2:
                    i++;
                    break;
                case 3:
                    i--;
                    break;
                default:
                    break;
            }
        }
    }
}
