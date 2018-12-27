package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public class zzsg {
    /* renamed from: a */
    public static final Pattern f10153a = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    /* renamed from: b */
    public static final Pattern f10154b = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    /* renamed from: c */
    private static final Uri f10155c = Uri.parse("content://com.google.android.gsf.gservices");
    /* renamed from: d */
    private static final Uri f10156d = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    /* renamed from: e */
    private static final AtomicBoolean f10157e = new AtomicBoolean();
    /* renamed from: f */
    private static HashMap<String, String> f10158f;
    /* renamed from: g */
    private static final HashMap<String, Boolean> f10159g = new HashMap();
    /* renamed from: h */
    private static final HashMap<String, Integer> f10160h = new HashMap();
    /* renamed from: i */
    private static final HashMap<String, Long> f10161i = new HashMap();
    /* renamed from: j */
    private static final HashMap<String, Float> f10162j = new HashMap();
    /* renamed from: k */
    private static Object f10163k;
    /* renamed from: l */
    private static boolean f10164l;
    /* renamed from: m */
    private static String[] f10165m = new String[0];

    /* renamed from: a */
    private static void m11960a(ContentResolver contentResolver) {
        if (f10158f == null) {
            f10157e.set(false);
            f10158f = new HashMap();
            f10163k = new Object();
            f10164l = false;
            contentResolver.registerContentObserver(f10155c, true, new ac(null));
            return;
        }
        if (f10157e.getAndSet(false) != null) {
            f10158f.clear();
            f10159g.clear();
            f10160h.clear();
            f10161i.clear();
            f10162j.clear();
            f10163k = new Object();
            f10164l = false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static java.lang.String m11957a(android.content.ContentResolver r13, java.lang.String r14, java.lang.String r15) {
        /*
        r15 = com.google.android.gms.internal.measurement.zzsg.class;
        monitor-enter(r15);
        m11960a(r13);	 Catch:{ all -> 0x00aa }
        r0 = f10163k;	 Catch:{ all -> 0x00aa }
        r1 = f10158f;	 Catch:{ all -> 0x00aa }
        r1 = r1.containsKey(r14);	 Catch:{ all -> 0x00aa }
        r2 = 0;
        if (r1 == 0) goto L_0x001f;
    L_0x0011:
        r13 = f10158f;	 Catch:{ all -> 0x00aa }
        r13 = r13.get(r14);	 Catch:{ all -> 0x00aa }
        r13 = (java.lang.String) r13;	 Catch:{ all -> 0x00aa }
        if (r13 == 0) goto L_0x001c;
    L_0x001b:
        goto L_0x001d;
    L_0x001c:
        r13 = r2;
    L_0x001d:
        monitor-exit(r15);	 Catch:{ all -> 0x00aa }
        return r13;
    L_0x001f:
        r1 = f10165m;	 Catch:{ all -> 0x00aa }
        r3 = r1.length;	 Catch:{ all -> 0x00aa }
        r4 = 0;
        r5 = 0;
    L_0x0024:
        r6 = 1;
        if (r5 >= r3) goto L_0x0063;
    L_0x0027:
        r7 = r1[r5];	 Catch:{ all -> 0x00aa }
        r7 = r14.startsWith(r7);	 Catch:{ all -> 0x00aa }
        if (r7 == 0) goto L_0x0060;
    L_0x002f:
        r0 = f10164l;	 Catch:{ all -> 0x00aa }
        if (r0 == 0) goto L_0x003b;
    L_0x0033:
        r0 = f10158f;	 Catch:{ all -> 0x00aa }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x00aa }
        if (r0 == 0) goto L_0x005e;
    L_0x003b:
        r0 = f10165m;	 Catch:{ all -> 0x00aa }
        r1 = f10158f;	 Catch:{ all -> 0x00aa }
        r13 = m11958a(r13, r0);	 Catch:{ all -> 0x00aa }
        r1.putAll(r13);	 Catch:{ all -> 0x00aa }
        f10164l = r6;	 Catch:{ all -> 0x00aa }
        r13 = f10158f;	 Catch:{ all -> 0x00aa }
        r13 = r13.containsKey(r14);	 Catch:{ all -> 0x00aa }
        if (r13 == 0) goto L_0x005e;
    L_0x0050:
        r13 = f10158f;	 Catch:{ all -> 0x00aa }
        r13 = r13.get(r14);	 Catch:{ all -> 0x00aa }
        r13 = (java.lang.String) r13;	 Catch:{ all -> 0x00aa }
        if (r13 == 0) goto L_0x005b;
    L_0x005a:
        goto L_0x005c;
    L_0x005b:
        r13 = r2;
    L_0x005c:
        monitor-exit(r15);	 Catch:{ all -> 0x00aa }
        return r13;
    L_0x005e:
        monitor-exit(r15);	 Catch:{ all -> 0x00aa }
        return r2;
    L_0x0060:
        r5 = r5 + 1;
        goto L_0x0024;
    L_0x0063:
        monitor-exit(r15);	 Catch:{ all -> 0x00aa }
        r8 = f10155c;
        r9 = 0;
        r10 = 0;
        r11 = new java.lang.String[r6];
        r11[r4] = r14;
        r12 = 0;
        r7 = r13;
        r13 = r7.query(r8, r9, r10, r11, r12);
        if (r13 != 0) goto L_0x007a;
    L_0x0074:
        if (r13 == 0) goto L_0x0079;
    L_0x0076:
        r13.close();
    L_0x0079:
        return r2;
    L_0x007a:
        r15 = r13.moveToFirst();	 Catch:{ all -> 0x00a3 }
        if (r15 != 0) goto L_0x0089;
    L_0x0080:
        m11961a(r0, r14, r2);	 Catch:{ all -> 0x00a3 }
        if (r13 == 0) goto L_0x0088;
    L_0x0085:
        r13.close();
    L_0x0088:
        return r2;
    L_0x0089:
        r15 = r13.getString(r6);	 Catch:{ all -> 0x00a3 }
        if (r15 == 0) goto L_0x0096;
    L_0x008f:
        r1 = r15.equals(r2);	 Catch:{ all -> 0x00a3 }
        if (r1 == 0) goto L_0x0096;
    L_0x0095:
        r15 = r2;
    L_0x0096:
        m11961a(r0, r14, r15);	 Catch:{ all -> 0x00a3 }
        if (r15 == 0) goto L_0x009c;
    L_0x009b:
        goto L_0x009d;
    L_0x009c:
        r15 = r2;
    L_0x009d:
        if (r13 == 0) goto L_0x00a2;
    L_0x009f:
        r13.close();
    L_0x00a2:
        return r15;
    L_0x00a3:
        r14 = move-exception;
        if (r13 == 0) goto L_0x00a9;
    L_0x00a6:
        r13.close();
    L_0x00a9:
        throw r14;
    L_0x00aa:
        r13 = move-exception;
        monitor-exit(r15);	 Catch:{ all -> 0x00aa }
        throw r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzsg.a(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    private static void m11961a(Object obj, String str, String str2) {
        synchronized (zzsg.class) {
            if (obj == f10163k) {
                f10158f.put(str, str2);
            }
        }
    }

    /* renamed from: a */
    public static boolean m11963a(ContentResolver contentResolver, String str, boolean z) {
        Object b = m11964b(contentResolver);
        Object obj = (Boolean) m11956a(f10159g, str, Boolean.valueOf(z));
        if (obj != null) {
            return obj.booleanValue();
        }
        contentResolver = m11957a(contentResolver, str, null);
        if (contentResolver != null) {
            if (!contentResolver.equals("")) {
                if (f10153a.matcher(contentResolver).matches()) {
                    obj = Boolean.valueOf(true);
                    z = true;
                } else if (f10154b.matcher(contentResolver).matches()) {
                    obj = Boolean.valueOf(false);
                    z = false;
                } else {
                    StringBuilder stringBuilder = new StringBuilder("attempt to read gservices key ");
                    stringBuilder.append(str);
                    stringBuilder.append(" (value \"");
                    stringBuilder.append(contentResolver);
                    stringBuilder.append("\") as boolean");
                    Log.w("Gservices", stringBuilder.toString());
                }
            }
        }
        m11962a(b, f10159g, str, obj);
        return z;
    }

    /* renamed from: a */
    private static Map<String, String> m11958a(ContentResolver contentResolver, String... strArr) {
        contentResolver = contentResolver.query(f10156d, null, null, strArr, null);
        strArr = new TreeMap();
        if (contentResolver == null) {
            return strArr;
        }
        while (contentResolver.moveToNext()) {
            try {
                strArr.put(contentResolver.getString(0), contentResolver.getString(1));
            } finally {
                contentResolver.close();
            }
        }
        return strArr;
    }

    /* renamed from: b */
    private static Object m11964b(ContentResolver contentResolver) {
        synchronized (zzsg.class) {
            m11960a(contentResolver);
            contentResolver = f10163k;
        }
        return contentResolver;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static <T> T m11956a(java.util.HashMap<java.lang.String, T> r2, java.lang.String r3, T r4) {
        /*
        r0 = com.google.android.gms.internal.measurement.zzsg.class;
        monitor-enter(r0);
        r1 = r2.containsKey(r3);	 Catch:{ all -> 0x0016 }
        if (r1 == 0) goto L_0x0013;
    L_0x0009:
        r2 = r2.get(r3);	 Catch:{ all -> 0x0016 }
        if (r2 == 0) goto L_0x0010;
    L_0x000f:
        goto L_0x0011;
    L_0x0010:
        r2 = r4;
    L_0x0011:
        monitor-exit(r0);	 Catch:{ all -> 0x0016 }
        return r2;
    L_0x0013:
        monitor-exit(r0);	 Catch:{ all -> 0x0016 }
        r2 = 0;
        return r2;
    L_0x0016:
        r2 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0016 }
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzsg.a(java.util.HashMap, java.lang.String, java.lang.Object):T");
    }

    /* renamed from: a */
    private static <T> void m11962a(Object obj, HashMap<String, T> hashMap, String str, T t) {
        synchronized (zzsg.class) {
            if (obj == f10163k) {
                hashMap.put(str, t);
                f10158f.remove(str);
            }
        }
    }
}
