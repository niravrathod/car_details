package com.google.android.exoplayer2.p126c;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.c.c */
public final class C2165c {
    /* renamed from: a */
    private static final Pattern f6699a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    /* renamed from: b */
    private static final Pattern f6700b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    /* renamed from: c */
    private static final Pattern f6701c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
    /* renamed from: d */
    private static final Map<String, Integer> f6702d = new HashMap();

    /* renamed from: a */
    private static int m7926a(int i, int i2, int i3, int i4) {
        return (((i << 24) | (i2 << 16)) | (i3 << 8)) | i4;
    }

    static {
        f6702d.put("aliceblue", Integer.valueOf(-984833));
        f6702d.put("antiquewhite", Integer.valueOf(-332841));
        f6702d.put("aqua", Integer.valueOf(-16711681));
        f6702d.put("aquamarine", Integer.valueOf(-8388652));
        f6702d.put("azure", Integer.valueOf(-983041));
        f6702d.put("beige", Integer.valueOf(-657956));
        f6702d.put("bisque", Integer.valueOf(-6972));
        f6702d.put("black", Integer.valueOf(-16777216));
        f6702d.put("blanchedalmond", Integer.valueOf(-5171));
        f6702d.put("blue", Integer.valueOf(-16776961));
        f6702d.put("blueviolet", Integer.valueOf(-7722014));
        f6702d.put("brown", Integer.valueOf(-5952982));
        f6702d.put("burlywood", Integer.valueOf(-2180985));
        f6702d.put("cadetblue", Integer.valueOf(-10510688));
        f6702d.put("chartreuse", Integer.valueOf(-8388864));
        f6702d.put("chocolate", Integer.valueOf(-2987746));
        f6702d.put("coral", Integer.valueOf(-32944));
        f6702d.put("cornflowerblue", Integer.valueOf(-10185235));
        f6702d.put("cornsilk", Integer.valueOf(-1828));
        f6702d.put("crimson", Integer.valueOf(-2354116));
        f6702d.put("cyan", Integer.valueOf(-16711681));
        f6702d.put("darkblue", Integer.valueOf(-16777077));
        f6702d.put("darkcyan", Integer.valueOf(-16741493));
        f6702d.put("darkgoldenrod", Integer.valueOf(-4684277));
        f6702d.put("darkgray", Integer.valueOf(-5658199));
        f6702d.put("darkgreen", Integer.valueOf(-16751616));
        f6702d.put("darkgrey", Integer.valueOf(-5658199));
        f6702d.put("darkkhaki", Integer.valueOf(-4343957));
        f6702d.put("darkmagenta", Integer.valueOf(-7667573));
        f6702d.put("darkolivegreen", Integer.valueOf(-11179217));
        f6702d.put("darkorange", Integer.valueOf(-29696));
        f6702d.put("darkorchid", Integer.valueOf(-6737204));
        f6702d.put("darkred", Integer.valueOf(-7667712));
        f6702d.put("darksalmon", Integer.valueOf(-1468806));
        f6702d.put("darkseagreen", Integer.valueOf(-7357297));
        f6702d.put("darkslateblue", Integer.valueOf(-12042869));
        f6702d.put("darkslategray", Integer.valueOf(-13676721));
        f6702d.put("darkslategrey", Integer.valueOf(-13676721));
        f6702d.put("darkturquoise", Integer.valueOf(-16724271));
        f6702d.put("darkviolet", Integer.valueOf(-7077677));
        f6702d.put("deeppink", Integer.valueOf(-60269));
        f6702d.put("deepskyblue", Integer.valueOf(-16728065));
        f6702d.put("dimgray", Integer.valueOf(-9868951));
        f6702d.put("dimgrey", Integer.valueOf(-9868951));
        f6702d.put("dodgerblue", Integer.valueOf(-14774017));
        f6702d.put("firebrick", Integer.valueOf(-5103070));
        f6702d.put("floralwhite", Integer.valueOf(-1296));
        f6702d.put("forestgreen", Integer.valueOf(-14513374));
        f6702d.put("fuchsia", Integer.valueOf(-65281));
        f6702d.put("gainsboro", Integer.valueOf(-2302756));
        f6702d.put("ghostwhite", Integer.valueOf(-460545));
        f6702d.put("gold", Integer.valueOf(-10496));
        f6702d.put("goldenrod", Integer.valueOf(-2448096));
        f6702d.put("gray", Integer.valueOf(-8355712));
        f6702d.put("green", Integer.valueOf(-16744448));
        f6702d.put("greenyellow", Integer.valueOf(-5374161));
        f6702d.put("grey", Integer.valueOf(-8355712));
        f6702d.put("honeydew", Integer.valueOf(-983056));
        f6702d.put("hotpink", Integer.valueOf(-38476));
        f6702d.put("indianred", Integer.valueOf(-3318692));
        f6702d.put("indigo", Integer.valueOf(-11861886));
        f6702d.put("ivory", Integer.valueOf(-16));
        f6702d.put("khaki", Integer.valueOf(-989556));
        f6702d.put("lavender", Integer.valueOf(-1644806));
        f6702d.put("lavenderblush", Integer.valueOf(-3851));
        f6702d.put("lawngreen", Integer.valueOf(-8586240));
        f6702d.put("lemonchiffon", Integer.valueOf(-1331));
        f6702d.put("lightblue", Integer.valueOf(-5383962));
        f6702d.put("lightcoral", Integer.valueOf(-1015680));
        f6702d.put("lightcyan", Integer.valueOf(-2031617));
        f6702d.put("lightgoldenrodyellow", Integer.valueOf(-329006));
        f6702d.put("lightgray", Integer.valueOf(-2894893));
        f6702d.put("lightgreen", Integer.valueOf(-7278960));
        f6702d.put("lightgrey", Integer.valueOf(-2894893));
        f6702d.put("lightpink", Integer.valueOf(-18751));
        f6702d.put("lightsalmon", Integer.valueOf(-24454));
        f6702d.put("lightseagreen", Integer.valueOf(-14634326));
        f6702d.put("lightskyblue", Integer.valueOf(-7876870));
        f6702d.put("lightslategray", Integer.valueOf(-8943463));
        f6702d.put("lightslategrey", Integer.valueOf(-8943463));
        f6702d.put("lightsteelblue", Integer.valueOf(-5192482));
        f6702d.put("lightyellow", Integer.valueOf(-32));
        f6702d.put("lime", Integer.valueOf(-16711936));
        f6702d.put("limegreen", Integer.valueOf(-13447886));
        f6702d.put("linen", Integer.valueOf(-331546));
        f6702d.put("magenta", Integer.valueOf(-65281));
        f6702d.put("maroon", Integer.valueOf(-8388608));
        f6702d.put("mediumaquamarine", Integer.valueOf(-10039894));
        f6702d.put("mediumblue", Integer.valueOf(-16777011));
        f6702d.put("mediumorchid", Integer.valueOf(-4565549));
        f6702d.put("mediumpurple", Integer.valueOf(-7114533));
        f6702d.put("mediumseagreen", Integer.valueOf(-12799119));
        f6702d.put("mediumslateblue", Integer.valueOf(-8689426));
        f6702d.put("mediumspringgreen", Integer.valueOf(-16713062));
        f6702d.put("mediumturquoise", Integer.valueOf(-12004916));
        f6702d.put("mediumvioletred", Integer.valueOf(-3730043));
        f6702d.put("midnightblue", Integer.valueOf(-15132304));
        f6702d.put("mintcream", Integer.valueOf(-655366));
        f6702d.put("mistyrose", Integer.valueOf(-6943));
        f6702d.put("moccasin", Integer.valueOf(-6987));
        f6702d.put("navajowhite", Integer.valueOf(-8531));
        f6702d.put("navy", Integer.valueOf(-16777088));
        f6702d.put("oldlace", Integer.valueOf(-133658));
        f6702d.put("olive", Integer.valueOf(-8355840));
        f6702d.put("olivedrab", Integer.valueOf(-9728477));
        f6702d.put("orange", Integer.valueOf(-23296));
        f6702d.put("orangered", Integer.valueOf(-47872));
        f6702d.put("orchid", Integer.valueOf(-2461482));
        f6702d.put("palegoldenrod", Integer.valueOf(-1120086));
        f6702d.put("palegreen", Integer.valueOf(-6751336));
        f6702d.put("paleturquoise", Integer.valueOf(-5247250));
        f6702d.put("palevioletred", Integer.valueOf(-2396013));
        f6702d.put("papayawhip", Integer.valueOf(-4139));
        f6702d.put("peachpuff", Integer.valueOf(-9543));
        f6702d.put("peru", Integer.valueOf(-3308225));
        f6702d.put("pink", Integer.valueOf(-16181));
        f6702d.put("plum", Integer.valueOf(-2252579));
        f6702d.put("powderblue", Integer.valueOf(-5185306));
        f6702d.put("purple", Integer.valueOf(-8388480));
        f6702d.put("rebeccapurple", Integer.valueOf(-10079335));
        f6702d.put("red", Integer.valueOf(-65536));
        f6702d.put("rosybrown", Integer.valueOf(-4419697));
        f6702d.put("royalblue", Integer.valueOf(-12490271));
        f6702d.put("saddlebrown", Integer.valueOf(-7650029));
        f6702d.put("salmon", Integer.valueOf(-360334));
        f6702d.put("sandybrown", Integer.valueOf(-744352));
        f6702d.put("seagreen", Integer.valueOf(-13726889));
        f6702d.put("seashell", Integer.valueOf(-2578));
        f6702d.put("sienna", Integer.valueOf(-6270419));
        f6702d.put("silver", Integer.valueOf(-4144960));
        f6702d.put("skyblue", Integer.valueOf(-7876885));
        f6702d.put("slateblue", Integer.valueOf(-9807155));
        f6702d.put("slategray", Integer.valueOf(-9404272));
        f6702d.put("slategrey", Integer.valueOf(-9404272));
        f6702d.put("snow", Integer.valueOf(-1286));
        f6702d.put("springgreen", Integer.valueOf(-16711809));
        f6702d.put("steelblue", Integer.valueOf(-12156236));
        f6702d.put("tan", Integer.valueOf(-2968436));
        f6702d.put("teal", Integer.valueOf(-16744320));
        f6702d.put("thistle", Integer.valueOf(-2572328));
        f6702d.put("tomato", Integer.valueOf(-40121));
        f6702d.put("transparent", Integer.valueOf(0));
        f6702d.put("turquoise", Integer.valueOf(-12525360));
        f6702d.put("violet", Integer.valueOf(-1146130));
        f6702d.put("wheat", Integer.valueOf(-663885));
        f6702d.put("white", Integer.valueOf(-1));
        f6702d.put("whitesmoke", Integer.valueOf(-657931));
        f6702d.put("yellow", Integer.valueOf(-256));
        f6702d.put("yellowgreen", Integer.valueOf(-6632142));
    }

    /* renamed from: a */
    public static int m7927a(String str) {
        return C2165c.m7928a(str, false);
    }

    /* renamed from: b */
    public static int m7929b(String str) {
        return C2165c.m7928a(str, true);
    }

    /* renamed from: a */
    private static int m7928a(String str, boolean z) {
        C2163a.m7916a(TextUtils.isEmpty(str) ^ true);
        str = str.replace(" ", "");
        if (str.charAt(0) == '#') {
            z = (int) Long.parseLong(str.substring(1), 16);
            if (str.length() == 7) {
                str = -16777216 | z;
            } else if (str.length() == 9) {
                str = ((z & 255) << 24) | (z >>> 8);
            } else {
                throw new IllegalArgumentException();
            }
            return str;
        }
        if (str.startsWith("rgba")) {
            str = (z ? f6701c : f6700b).matcher(str);
            if (str.matches()) {
                if (z) {
                    z = (int) (Float.parseFloat(str.group(4)) * true);
                } else {
                    z = Integer.parseInt(str.group(4), 10);
                }
                return C2165c.m7926a(z, Integer.parseInt(str.group(1), 10), Integer.parseInt(str.group(2), 10), Integer.parseInt(str.group(3), 10));
            }
        } else if (str.startsWith("rgb")) {
            str = f6699a.matcher(str);
            if (str.matches()) {
                return C2165c.m7925a(Integer.parseInt(str.group(1), 10), Integer.parseInt(str.group(2), 10), Integer.parseInt(str.group(3), 10));
            }
        } else {
            Integer num = (Integer) f6702d.get(C2186s.m8061d(str));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    private static int m7925a(int i, int i2, int i3) {
        return C2165c.m7926a(255, i, i2, i3);
    }
}
