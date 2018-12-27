package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.C2267n;
import com.google.android.exoplayer2.p126c.C2175k;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* renamed from: com.google.android.exoplayer2.extractor.flv.c */
final class C4018c extends TagPayloadReader {
    /* renamed from: b */
    private long f16168b = -9223372036854775807L;

    /* renamed from: a */
    protected boolean mo1621a(C2175k c2175k) {
        return true;
    }

    public C4018c(C2267n c2267n) {
        super(c2267n);
    }

    /* renamed from: a */
    public long m20118a() {
        return this.f16168b;
    }

    /* renamed from: a */
    protected void mo1620a(C2175k c2175k, long j) {
        if (C4018c.m20110b(c2175k) == 2) {
            if ("onMetaData".equals(C4018c.m20113e(c2175k)) != null && C4018c.m20110b(c2175k) == 8) {
                c2175k = C4018c.m20116h(c2175k);
                if (c2175k.containsKey("duration") != null) {
                    c2175k = ((Double) c2175k.get("duration")).doubleValue();
                    if (c2175k > 0.0d) {
                        this.f16168b = (long) (c2175k * 1000000.0d);
                    }
                }
                return;
            }
            return;
        }
        throw new ParserException();
    }

    /* renamed from: b */
    private static int m20110b(C2175k c2175k) {
        return c2175k.m7986g();
    }

    /* renamed from: c */
    private static Boolean m20111c(C2175k c2175k) {
        boolean z = true;
        if (c2175k.m7986g() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: d */
    private static Double m20112d(C2175k c2175k) {
        return Double.valueOf(Double.longBitsToDouble(c2175k.m7995p()));
    }

    /* renamed from: e */
    private static String m20113e(C2175k c2175k) {
        int h = c2175k.m7987h();
        int d = c2175k.m7980d();
        c2175k.m7981d(h);
        return new String(c2175k.f6735a, d, h);
    }

    /* renamed from: f */
    private static ArrayList<Object> m20114f(C2175k c2175k) {
        int t = c2175k.m7999t();
        ArrayList<Object> arrayList = new ArrayList(t);
        for (int i = 0; i < t; i++) {
            arrayList.add(C4018c.m20109a(c2175k, C4018c.m20110b(c2175k)));
        }
        return arrayList;
    }

    /* renamed from: g */
    private static HashMap<String, Object> m20115g(C2175k c2175k) {
        HashMap<String, Object> hashMap = new HashMap();
        while (true) {
            String e = C4018c.m20113e(c2175k);
            int b = C4018c.m20110b(c2175k);
            if (b == 9) {
                return hashMap;
            }
            hashMap.put(e, C4018c.m20109a(c2175k, b));
        }
    }

    /* renamed from: h */
    private static HashMap<String, Object> m20116h(C2175k c2175k) {
        int t = c2175k.m7999t();
        HashMap<String, Object> hashMap = new HashMap(t);
        for (int i = 0; i < t; i++) {
            hashMap.put(C4018c.m20113e(c2175k), C4018c.m20109a(c2175k, C4018c.m20110b(c2175k)));
        }
        return hashMap;
    }

    /* renamed from: i */
    private static Date m20117i(C2175k c2175k) {
        Date date = new Date((long) C4018c.m20112d(c2175k).doubleValue());
        c2175k.m7981d(2);
        return date;
    }

    /* renamed from: a */
    private static Object m20109a(C2175k c2175k, int i) {
        if (i == 8) {
            return C4018c.m20116h(c2175k);
        }
        switch (i) {
            case 0:
                return C4018c.m20112d(c2175k);
            case 1:
                return C4018c.m20111c(c2175k);
            case 2:
                return C4018c.m20113e(c2175k);
            case 3:
                return C4018c.m20115g(c2175k);
            default:
                switch (i) {
                    case 10:
                        return C4018c.m20114f(c2175k);
                    case 11:
                        return C4018c.m20117i(c2175k);
                    default:
                        return null;
                }
        }
    }
}
